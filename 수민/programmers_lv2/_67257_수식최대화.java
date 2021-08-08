class Solution {
    public long solution(String expression) {
        long answer = 0;

        int plus = 0, minus = 0, mul = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+') {
                plus++;
            } else if (expression.charAt(i) == '-') {
                minus++;
            } else if (expression.charAt(i) == '*') {
                mul++;
            }
        }
        expression = expression.replace("+", "#");
        expression = expression.replace("-", "#");
        expression = expression.replace("*", "#");

        String[] numbers = expression.split("#");

        return answer;
    }
}