import java.util.HashMap;

public class _12981_영어끝말잇기 {

	public static void main(String[] args) {
		String[] words= {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		int[] arr=solution(3, words);
		for(int e : arr) {
			System.out.println(e);
		}
	}
	
	public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        HashMap<String, String> map=new HashMap<>();
        map.put(words[0], words[0]);
        int idx=0;
        char last=words[0].charAt(words[0].length()-1);
        for(int i=1; i<words.length; i++){
            String st=words[i];
            
            if(last!=st.charAt(0)){
                idx=i+1;
                break;
            }
            else if(map.containsKey(st)){
                idx=i+1;
                break;
            }
            else{
                map.put(st, st);
                last=st.charAt(st.length()-1);
            }
        }
        
        if(idx==1){
            return answer;
        }
        
        if(idx%n == 0) {
            answer[0] =n;
            answer[1]=idx/n;
        }else{
            answer[0]=idx%n;
            answer[1]=idx/n+1;
        }
        
        return answer;
    }

}
