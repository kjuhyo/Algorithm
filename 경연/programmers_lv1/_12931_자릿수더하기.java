import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

		//1. 무한반복돌려서 계쏙 나눠서 나머지 계쏙 더해야지 뭐...
		
		while(true) {
			answer += n%10;
			if(n<10) {
				break;
			}
			n = n/10;

		}
		
        return answer;
    }
}