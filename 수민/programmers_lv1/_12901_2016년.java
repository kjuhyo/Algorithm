class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int day = 0;
        switch (a) {
            case 2:
                day += 31;
                break;
            case 3:
                day += 60;
                break;
            case 4:
                day += 91;
                break;
            case 5:
                day += 121;
                break;
            case 6:
                day += 152;
                break;
            case 7:
                day += 182;
                break;
            case 8:
                day += 213;
                break;
            case 9:
                day += 244;
                break;
            case 10:
                day += 274;
                break;
            case 11:
                day += 305;
                break;
            case 12:
                day += 335;
                break;
            default:
                break;
        }

        switch ((day + b) % 7) {
            case 0:
                answer = "THU";
                break;
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            default:
                break;
        }

        return answer;
    }
}