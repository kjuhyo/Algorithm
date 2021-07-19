class Solution {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 1) {
            int mid = (s.length() - 1) / 2;
            answer = String.valueOf(s.charAt(mid));
        } else {
            answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        }

        return answer;
    }
}