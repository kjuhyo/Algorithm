package 알고리즘깃;

public class _12948_핸드폰번호가리기 {
	public String solution(String phone_number) {
        if(phone_number.length()==4){
            return phone_number;
        }else {
            String str = "";
            for(int i=phone_number.length()-1; i>phone_number.length()-5; i--){
                str+=phone_number.charAt(i);
            }
            if(phone_number.length()-5 != 0){
                for(int i=phone_number.length()-5; i>=0; i--){
                    str+="*";
                }
            }
            // reverse 
            StringBuffer sb = new StringBuffer(str); 
            String answer = sb.reverse().toString();
            return answer;
        }
       
    }
	
	public String solution2(String phone_number) {
        String answer="";
        for(int i=0; i<phone_number.length()-4; i++){
            answer+="*";
        }
        answer+=phone_number.substring(phone_number.length()-4); //시작위치 지정해주면 거기서부터 맨끝까지
        return answer;
	}
	
}
