package 알고리즘깃;

public class _12943_콜라츠추측 {
	 public long solution(long num) {
	        long answer = 0;
	        for(int i=0; i<500; i++){
	            if(num==1) {
	                return answer;
	            }
	            if(num%2==0) num=num/2;
	            else {
	                num=num*3+1;
	            }
	            answer++;
	        }
	        return -1;
	    }
}
