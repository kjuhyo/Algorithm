import java.util.HashSet;

public class _42839_소수찾기 {
	static char c[];
    static int N, answer;
    static boolean check[];
    static HashSet<Integer> list;
    
    public int solution(String numbers) {
        N=numbers.length();
        c=new char[N];
        check=new boolean[N];
        for(int i=0; i<numbers.length(); i++){
            c[i]=numbers.charAt(i);
        }
        list=new HashSet<>();
        powerSet(0);
        
       
        return list.size();
    }
    public static void powerSet(int idx){
        if(idx==N){
            String s="";
            for(int i=0; i<N; i++){
                if(check[i]) {
                	s+=c[i]; 
                }
            }
            if(!s.equals("")) {
            	int n=Integer.parseInt(s);
            	if(n!=1) {
            		if(n%2==1 || n==2){
            			//answer+=1;
            			list.add(n);
            		}
            	}
            }
            return;
        }
        check[idx]=true;
        powerSet(idx+1);
        check[idx]=false;
        powerSet(idx+1);
    }
}
