package 알고리즘깃;

public class _12912_두정수사이의합 {
	 public long solution(int a, int b) {
	        long answer = 0;
	        if(a>b){
	            int tmp=a;
	            a=b;
	            b=tmp;
	        }
	        for(int i=a; i<=b; i++){
	            answer+=i;
	        }
	        return answer;
	    }
}
