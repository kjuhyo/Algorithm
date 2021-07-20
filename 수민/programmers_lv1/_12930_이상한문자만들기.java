class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        int cur = 0;
        for (String str : arr) {
            if (str.equals(" ")) {
                cur = 0;
                answer += " ";
            } else {
                answer += (cur % 2 == 1 ? str.toLowerCase() : str.toUpperCase());
                cur++;
            }
        }

        return answer;
    }
}