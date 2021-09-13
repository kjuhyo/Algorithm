import java.util.ArrayList;

public class _64065_튜플 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=solution("{{2},{2,1},{2,1,3},{2,1,3,4}}");
		for(int e:arr) {
			System.out.print(e+" ");
		}System.out.println();
	}
	
	public static int[] solution(String s) {
        int idx=0;
        String num="";
        ArrayList<Integer> list=new ArrayList<>();
        while(idx<s.length()){
            if(s.charAt(idx)!='{' && s.charAt(idx)!='}' && s.charAt(idx)!=','){
                num+=s.charAt(idx);
            }else{
                if(!num.equals("")){
                	int n=Integer.parseInt(num);
                    if(list.indexOf(n)<0){
                        list.add(n);
                    }  
                }
                num="";
            }
            idx++;
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }

}
