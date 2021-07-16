package 알고리즘깃;

import java.util.ArrayList;
import java.util.Collections;

public class _12917_문자열내림차순으로배치하기 {
	public String solution(String s) {
        String answer = "";
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        Collections.sort(list);
        for(int i=list.size()-1; i>=0; i--){
            answer+=list.get(i);
        }
        return answer;
    }
}
