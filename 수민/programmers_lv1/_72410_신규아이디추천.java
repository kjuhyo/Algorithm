class Solution {
    public String solution(String new_id) {
        // 1
        String answer = new_id.toLowerCase();

        // 2
        char[] charArr = answer.toCharArray();
        answer = "";
        for (char c : charArr) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                answer += Character.toString(c);
            }
        }

        // 3
        String tmp = answer.replace("..", ".");
        while (tmp.contains("..")) {
            tmp = tmp.replace("..", ".");
        }

        // 4
        while (tmp.length() > 0 && tmp.charAt(0) == '.') {
            tmp = tmp.substring(1);
        }

        while (tmp.length() > 0 && tmp.charAt(tmp.length() - 1) == '.') {
            tmp = tmp.substring(0, tmp.length() - 1);
        }

        // 5
        if (tmp.length() == 0) {
            tmp = "a";
        }

        // 6
        if (tmp.length() >= 16) {
            tmp = tmp.substring(0, 15);
            if (tmp.charAt(14) == '.') {
                tmp = tmp.substring(0, 14);
            }
        }

        // 7
        if (tmp.length() <= 2) {
            char last = tmp.charAt(tmp.length() - 1);
            while (tmp.length() < 3) {
                tmp += Character.toString(last);
            }
        }

        answer = tmp;

        return answer;
    }
}