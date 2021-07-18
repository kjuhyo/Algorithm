import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        		int num = 10;
		int cnt = 0;
		
		for(int a : arr) {
			if(num!=a) {
				cnt++;
				num=a;
			}
		}
		
		int[] answer = new int[cnt];
		
		int fir = 10;
		int j=0;
		
		for(int a: arr) {
			if(fir!=a) {
				fir=a;
				answer[j]=fir;
				j++;
			}
		}
		
        return answer;
    }
}