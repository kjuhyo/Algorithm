class Solution {
    public int solution(String dartResult) {
        int answer = 0, now = 0, bonus = 0, num = 0;
        String str = "";
        while (dartResult.length() > 1) {
            if (!dartResult.substring(0, 2).equals("10")) {
                num = Character.getNumericValue(dartResult.charAt(0));
                str = Character.toString(dartResult.charAt(1));
                dartResult = dartResult.substring(2);
            } else {
                num = 10;
                str = Character.toString(dartResult.charAt(2));
                dartResult = dartResult.substring(3);
            }
            bonus = str.equals("S") ? 1 : (str.equals("D") ? 2 : 3);

            if (dartResult.length() > 0 && dartResult.charAt(0) == '*') {
                int star = now;
                now = (int) (Math.pow(num, bonus) * 2);
                answer += star + now;
                dartResult = dartResult.substring(1);
            } else if (dartResult.length() > 0 && dartResult.charAt(0) == '#') {
                now = (int) (-1 * Math.pow(num, bonus));
                answer += now;
                dartResult = dartResult.substring(1);
            } else {
                now = (int) Math.pow(num, bonus);
                answer += now;
            }
        }

        return answer;
    }
}