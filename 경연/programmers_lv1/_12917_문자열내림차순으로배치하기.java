import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = new String[s.length()];
		for(int i=0;i<s.length();i++) {
			array[i]=Character.toString(s.charAt(i));
		}
		Arrays.sort(array, Collections.reverseOrder());
		for(String a:array) {
			answer+=a;
		}
        
        return answer;
    }
}