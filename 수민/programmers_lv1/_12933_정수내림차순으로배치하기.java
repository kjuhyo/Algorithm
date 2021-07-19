import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public long solution(long n) {

        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add((int) (n % 10));
            n /= 10;
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);

        long answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] * Math.pow(10, i);
        }

        return answer;
    }
}