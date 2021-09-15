
public class _12951_JadenCase문자열만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution("people  p P pe "));
		System.out.println("마지막띄어쓰기확인용");
	}

	public static String solution(String s) {
		String answer = "";
        
        String[] str=s.split(" ");
        for(int i=0; i<str.length; i++){
            String st=str[i];
            if(st.length()==0) {
            	answer+=" ";
            	continue;
            }
            if(Character.isDigit(st.charAt(0))) {
            	answer+=Character.toString(st.charAt(0));
            }
            else if(Character.isLowerCase(st.charAt(0))){
                answer+=Character.toUpperCase(st.charAt(0));
            }
            else {
            	answer+=Character.toString(st.charAt(0));
            }
            for(int j=1; j<st.length(); j++) {
            	if(Character.isUpperCase(st.charAt(j))) {
            		answer+=Character.toLowerCase(st.charAt(j));
            	}else {
            		answer+=Character.toString(st.charAt(j));
            	}
            }
            
            if(i!=str.length-1) {
            	answer+=" ";
            }
        }
        if(s.charAt(s.length()-1)==' ') {
        	answer+=" ";
        }
        
        return answer;
    }
}
