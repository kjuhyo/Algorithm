import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) {
                cnt++;
                list.add(i);
            }
        }

        if (cnt == 0) {
            int[] answer = { -1 };
            return answer;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
