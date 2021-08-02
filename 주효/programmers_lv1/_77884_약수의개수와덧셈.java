package 알고리즘깃;

public class _77884_약수의개수와덧셈 {
	  public int solution(int left, int right) {
	        int answer = 0;
	        for(int num=left; num<=right; num++){
	            int count=0;
	            for(int i=1; i<=num; i++){
	                if((num%i)==0){
	                    count++;
	                }
	            }
	            if(count%2==0){
	                answer+=num;
	            }else{
	                answer-=num;
	            }
	        }
	        return answer;
	    }
}
