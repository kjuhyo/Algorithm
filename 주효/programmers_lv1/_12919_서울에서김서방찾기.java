package 알고리즘깃;

public class _12919_서울에서김서방찾기 {
	  public String solution(String[] seoul) {
	        int x=0;
	        
	        for(int i=0; i<seoul.length; i++){
	            if(seoul[i].equals("Kim")) {
	                x=i;
	                break;
	            }
	        }
	        String answer = "김서방은 "+x+"에 있다";
	        return answer;
	    }
}
