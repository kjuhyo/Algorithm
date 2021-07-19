class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int lcm = n * m;
        while (m != 0) {
            int r = n % m;

            n = m;
            m = r;
        }

        answer[0] = n;
        answer[1] = lcm / n;
        return answer;
    }
}