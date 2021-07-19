import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int now = arr[0];
        int cnt = 1, j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == now) { // 이미 나온 숫자인 경우
                arr[i] = -1;
            } else {
                now = arr[i];
                cnt++;
            }
        }

        int[] answer = new int[cnt];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }
}
