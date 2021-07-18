import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
    
        int j=0;
		for(int a: arr) {
			if(a%divisor==0)
				j++;
		}
		int[] answer;
		if(j==0) {
			answer = new int[1];
			answer[j]=-1;
		}else {
			answer = new int[j];
			int k=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%divisor==0) {
					answer[k]=arr[i];
					k++;
				}
			}
			
		}
		
		Arrays.sort(answer);
        
        
        return answer;
    }
}