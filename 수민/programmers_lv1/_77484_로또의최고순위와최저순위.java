class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0, cnt = 0;
        for (int i : lottos) {
            if (i == 0) {
                zero++;
            }
        }

        for (int i : lottos) {
            for (int j : win_nums) {
                if (i == j)
                    cnt++;
            }
        }

        int[] answer = new int[2];
        if (zero == 0 && cnt == 0) {
            answer[0] = 6;
            answer[1] = 6;
            return answer;
        } else {
            answer[0] = 7 - (zero + cnt);
        }

        if (zero == 6) {
            answer[1] = 6;
        } else {
            answer[1] = 7 - cnt;
        }

        return answer;
    }
}