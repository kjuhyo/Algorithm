class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i), ans = ' ';
            if (ch == ' ') {
                answer += " ";
            } else if (ch >= 'a' && ch <= 'z') {
                ans = (ch + n > 'z') ? (char) (ch + n - 26) : (char) (ch + n);
                answer += Character.toString(ans);
            } else if (ch >= 'A' && ch <= 'Z') {
                ans = (ch + n > 'Z') ? (char) (ch + n - 26) : (char) (ch + n);
                answer += Character.toString(ans);
            }
        }

        return answer;
    }
}
