package 알고리즘깃;

public class _12944_평균구하기 {
	public double solution(int[] arr) {
	      double sum=0;
	      for(int i : arr){
	          sum+=i;
	      }
	      double answer = sum/arr.length;
	      
	      return answer;
	  }
}
