class Solution {
    boolean solution(String s) {
        int pCnt = 0, yCnt = 0;

        while (s.contains("p")) {
            s = s.replaceFirst("p", "");
            pCnt++;
        }
        while (s.contains("P")) {
            s = s.replaceFirst("P", "");
            pCnt++;
        }
        while (s.contains("y")) {
            s = s.replaceFirst("y", "");
            yCnt++;
        }
        while (s.contains("Y")) {
            s = s.replaceFirst("Y", "");
            yCnt++;
        }

        if (pCnt == yCnt) {
            return true;
        } else {
            return false;
        }
    }
}