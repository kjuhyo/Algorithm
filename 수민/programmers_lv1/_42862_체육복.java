import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] total = new int[n];

        for (int i : reserve) {
            total[i - 1] = 1;
        }

        for (int i : lost) {
            if (total[i - 1] == 1) {
                total[i - 1] = 0;
            } else {
                total[i - 1] = -1;
            }
        }

        if (total[0] == -1) {
            if (total[1] == 1) {
                total[0] = 0;
                total[1] = 0;
            }
        }
        for (int i = 1; i < total.length - 1; i++) {
            if (total[i] == -1) {
                if (total[i - 1] == 1) {
                    total[i - 1] = 0;
                    total[i] = 0;
                } else if (total[i + 1] == 1) {
                    total[i] = 0;
                    total[i + 1] = 0;
                }
            }
        }
        if (total[total.length - 1] == -1) {
            if (total[total.length - 2] == 1) {
                total[total.length - 2] = 0;
                total[total.length - 1] = 0;
            }
        }

        for (int i = 0; i < total.length; i++) {
            if (total[i] == -1) {
                answer++;
            }
        }
        return n - answer;
    }
}