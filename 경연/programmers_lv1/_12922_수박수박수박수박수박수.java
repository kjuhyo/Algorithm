class Solution {
    public String solution(int n) {
        String answer = "";
        
        	String water="수박";
		
		int sha = n/2;
		int rem = n%2;
		
		for(int i=0;i<sha;i++) {
			answer+=water;
		}
		
		if(rem==1) answer+="수"; 
	
        
        return answer;
    }
}