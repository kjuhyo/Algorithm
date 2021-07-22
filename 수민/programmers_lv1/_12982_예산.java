import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        if (d[0] > budget) {
            return 0;
        }
        int total = 0, answer = 0;
        for (int i = 0; i < d.length; i++) {
            total += d[i];
            if (total > budget) {
                answer = i;
                return answer;
            } else if (total == budget) {
                answer = i + 1;
                return answer;
            }
        }

        return d.length;
    }
}