class Solution {
    public int solution(String s) {
        int answer = -1;

        while (true) {
            if (s.length() == 0)
                return 0;

            char pre = s.charAt(0);

            for (int i = 1; i < s.length(); i++) {
                if (pre == s.charAt(i)) {
                    pre = '0';
                    String tmp = s.substring(0, i - 1) + s.substring(i + 1);
                    s = tmp;
                    break;
                } else {
                    pre = s.charAt(i);
                }
            }
        }

        return answer;
    }
}