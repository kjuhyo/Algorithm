package 알고리즘깃;

import java.util.Arrays;

public class _42576_완주하지못한선수 {
	
	public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<completion.length; i++) {
        	if(!completion[i].equals(participant[i])) {
        		return participant[i];
        	}
        }
        
        return participant[participant.length-1];
    }

}
