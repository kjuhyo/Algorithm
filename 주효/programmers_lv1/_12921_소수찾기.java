package 알고리즘깃;

public class _12921_소수찾기 {
	 public int solution(int n) {
	        int answer = 0;
	        int[] arr=new int[n+1];
	        arr[0]=0;
	        arr[1]=0;
	        
	        for(int i=2; i<=n; i++){
	            arr[i]=1;
	        }
	        
	        for(int i=2; i*i<=n; i++){
	            if(arr[i]==1){
	                for(int j=i*2; j<=n; j+=i){
	                    arr[j]=0;
	                }
	            }
	        }
	        for(int i=2; i<arr.length; i++){
	            if(arr[i]==1) answer+=1;
	        }
	        return answer;
	    }
}
