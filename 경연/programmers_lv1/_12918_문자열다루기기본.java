class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        try {
    
			long l = Long.parseLong(s);
            answer = true;
            if(s.length()==4||s.length()==6) {
				answer = true;
			}else {
				answer = false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			answer = false;
		}
        
        return answer;
    }
}