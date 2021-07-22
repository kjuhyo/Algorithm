import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        List<String> list = new ArrayList<>();
        for (String str : strings) {
            String s = Character.toString(str.charAt(n));
            s += str;
            list.add(s);
        }
        Collections.sort(list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}