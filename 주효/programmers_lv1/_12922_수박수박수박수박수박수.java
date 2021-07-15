package 알고리즘깃;

public class _12922_수박수박수박수박수박수 {
	public String solution(int n) {
	      String answer = "수박";
	      char[] arr=new char[n];
	      char p=answer.charAt(0);
	      char q=answer.charAt(1);
	      
	      for(int i=0; i<n; i++){
	          if(i%2==0) arr[i]=p;
	          else arr[i]=q;
	      }
	      
	      answer=String.valueOf(arr);
	      return answer;
	  }
}
