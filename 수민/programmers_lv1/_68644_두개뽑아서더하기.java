import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> hash = new HashSet<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int a = numbers[i] + numbers[j];
                hash.add(a);
            }
        }

        List<Integer> list = new ArrayList(hash);
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}