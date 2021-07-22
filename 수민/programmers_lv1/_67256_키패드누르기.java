class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 3, right = 3;
        boolean isLeft = true, isRight = true;

        for (int i : numbers) {
            switch (i) {
                case 1, 4, 7:
                    answer += "L";
                    left = i / 3;
                    isLeft = true;
                    break;
                case 3, 6, 9:
                    answer += "R";
                    right = (i / 3) - 1;
                    isRight = true;
                    break;
                case 2, 5, 8, 0:
                    int now = ((i + 1) / 3) - 1;
                    if (now == -1) {
                        now = 3;
                    }

                    int diffL = isLeft ? 1 : 0;
                    diffL += Math.abs(left - now);
                    int diffR = isRight ? 1 : 0;
                    diffR += Math.abs(right - now);

                    if (diffL < diffR) {
                        answer += "L";
                        isLeft = false;
                        left = now;
                    } else if (diffL > diffR) {
                        answer += "R";
                        isRight = false;
                        right = now;
                    } else {
                        if (hand.equals("left")) {
                            answer += "L";
                            isLeft = false;
                            left = now;
                        } else {
                            answer += "R";
                            isRight = false;
                            right = now;
                        }
                    }
                    break;

            }
        }
        return answer;
    }
}
