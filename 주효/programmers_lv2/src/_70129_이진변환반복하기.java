
public class _70129_이진변환반복하기 {
	
	public static int[] solution(String s) {
        int[] answer = {0, 0};
        while(!s.equals("1")){
            if(s.contains("0")){
                answer[1]+=s.length()-s.replace("0","").length();
                s=s.replace("0","");
            }
            int len=s.length();
            s=Integer.toBinaryString(len);
            answer[0]+=1;
            
        }
        return answer;
    }

}
