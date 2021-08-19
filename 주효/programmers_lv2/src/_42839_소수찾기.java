import java.util.ArrayList;

public class _42839_소수찾기 {

    static int N, answer;
    static boolean check[];
    static char isSelected[];
    static char c[];
    static ArrayList<Integer> list;
    
	public static int solution(String numbers) {
		N=numbers.length();
		check=new boolean[N];
		isSelected=new char[N];
		c=new char[N];
		list=new ArrayList<>();
	    c=numbers.toCharArray();
	    
		for(int i=0; i<N; i++) {
			for(int j=1; j<=N; j++) {
				perm(i, j);	
			}
		}
		
		return list.size();
	}
    

    private static void perm(int idx, int range) { //순열인가
		if(idx==range) {
			String s="";
            for(int i=0; i<range; i++){
                s+=isSelected[i];
            }
           // System.out.println(s);
            find(s);
            return;
		}
		
		for(int i=0; i<range; i++) {
			if(!check[i]) {
				check[i]=true;
				isSelected[i]=c[idx];
				perm(idx+1, range);
				check[i]=false;
			}
		}
	}


	private static void find(String s) { //소수인지
		if(!s.equals("")) {
			s=s.replace(" ", "");
        	int n=Integer.parseInt(s);
        	if(n<2){
        	    return;		
        	} else if(n==2){
                if(list.indexOf(n)<0){
                        list.add(n);    
                }
                return;
            } else {
                for(int i=2; i<=Math.sqrt(n); i++){
                    if(n%i==0){
                        return;
                    }
                }
                if(list.indexOf(n)<0){
                        list.add(n);    
                }
                return;
            }
        	
        }
        return;
	}


	public static void main(String[] args) {
    	System.out.println(solution("011"));
    }
    
    //부분집합문제로 착각
   /* static char c[];
    static int N, answer;
    static boolean check[];
    static ArrayList<Integer> list;
    
    public int solution(String numbers) {
        N=numbers.length();
        c=new char[N];
        check=new boolean[N];
        for(int i=0; i<numbers.length(); i++){
            c[i]=numbers.charAt(i);
        }
        list=new ArrayList<>();
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
            	if(n<2){
            	    return;		
            	} else if(n==2){
                    if(list.indexOf(n)<0){
                            list.add(n);    
                    }
                    return;
                } else {
                    for(int i=2; i<=Math.sqrt(n); i++){
                        if(n%i==0){
                            return;
                        }
                    }
                    if(list.indexOf(n)<0){
                            list.add(n);    
                    }
                    return;
                }
            	
            }
            return;
        }
        check[idx]=true;
        powerSet(idx+1);
        check[idx]=false;
        powerSet(idx+1);
    }*/
    
    
    
    
}
