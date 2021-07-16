package 알고리즘깃;

public class _12918_문자열다루기기본 {
	public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==4 || s.length()==6){
            char c[]=new char[s.length()];
            for(int i=0; i<s.length(); i++){
                c[i]=s.charAt(i);
            }
            for(int j=0; j<c.length; j++){
                if(c[j]>=65) {
                    answer= false;
                    break;
                }
                else answer=true;
            }
            
        }
        return answer;
    }
}
