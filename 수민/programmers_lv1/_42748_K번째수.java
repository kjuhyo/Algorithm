import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int len = commands[i][1] - commands[i][0] + 1;
            int[] tmp = new int[len];
            for (int j = 0; j < len; j++) {
                tmp[j] = array[j - 1 + commands[i][0]];
            }
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2] - 1];
        }
        return answer;
    }
}