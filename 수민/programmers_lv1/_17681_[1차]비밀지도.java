class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] str1 = new String[n];
        String[] str2 = new String[n];

        for (int i = 0; i < str2.length; i++) {
            str1[i] = Integer.toBinaryString(arr1[i]);
            while (str1[i].length() != n) {
                str1[i] = "0" + str1[i];
            }
            str2[i] = Integer.toBinaryString(arr2[i]);
            while (str2[i].length() != n) {
                str2[i] = "0" + str2[i];
            }
        }

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (str1[i].charAt(j) == '1' || str2[i].charAt(j) == '1') {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String tmp = "";
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    tmp += " ";
                } else {
                    tmp += "#";
                }
            }
            answer[i] = tmp;
        }
        return answer;
    }
}