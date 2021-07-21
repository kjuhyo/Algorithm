class Solution {
    public int solution(int n) {
        int answer = 0;

        // 1. 뒤집으면서 3진법 만들기
        String not3 = "";
        while (n > 0) {
            not3 += n % 3;
            n /= 3;
        }
        while (not3.charAt(0) == '0') {
            not3 = not3.substring(1);
        }

        // 2. 10진법 변환
        for (int i = 0; i < not3.length(); i++) {
            answer += Character.getNumericValue(not3.charAt(i)) * Math.pow(3, not3.length() - 1 - i);
        }

        return answer;
    }
}
