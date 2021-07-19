class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (getCnt(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    private int getCnt(int i) {
        int cnt = 1; // 자기 자신 포함
        for (int j = 1; j <= i / 2; j++) {
            if (i % j == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
