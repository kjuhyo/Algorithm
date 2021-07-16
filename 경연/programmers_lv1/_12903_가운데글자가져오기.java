class Solution {
    public String solution(String s) {
        String answer = "";
		char[] line = s.toCharArray();
        int sh = line.length/2;
        int re = line.length%2;
        if(re==0){
        	answer=String.valueOf(line[sh-1])+String.valueOf(line[sh]);
        }else{
        	answer=String.valueOf(line[sh]);
        }
        return answer;
    }
}