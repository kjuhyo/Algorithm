class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = { -1 };
            return answer;
        }

        int num = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                num = i;
            }
        }

        int[] answer = new int[arr.length - 1];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != num) {
                answer[j] = arr[i];
                j++;
            }
        }

        return answer;
    }
}
