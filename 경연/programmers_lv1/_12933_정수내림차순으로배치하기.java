import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        //1. 자릿수만큼 int 배열을 만들고
		//2. 나누고 몫이랑 나머지로 이러쿵저러쿵해서 배열을 채우고
		//3. 배열 오름찰순으로 정리한다음에 
		//4. 자릿수로 *10해서 더하면되지않을까?
		
		int length = (int)(Math.log10(n)+1);
		int[] arr = new int[length];
		for(int i=0;i<length;i++) {
			int temp = (int) (n%10);
			arr[i] = temp;
			n = n/10;
		}
		Arrays.sort(arr);
		
		answer += arr[0];
		for(int i=1;i<length;i++) {
			answer += arr[i]*Math.pow(10,i);
		}
        
        return answer;
    }
}