
public class _12945_피보나치수 {
		public double solution(int n) {
	        double answer=fibo2(n);           
	        return answer;
	    }
	    public static int fibo(int n){ //테케 커지면 시간초과
	        if(n==0) return 0;
	        if(n==1) return 1;
	        return fibo(n-1)+fibo(n-2);
	    }
	    
	    public static double fibo2(int n){
	        double arr[]=new double[n+1];
	        arr[0]=0; arr[1]=1;
	        int idx=2;
	        while(idx<=n){
	            arr[idx]=arr[idx-1]%1234567+arr[idx-2]%1234567; //자료형의 제한때문에 그렇다.
	            idx++;
	        }
	        return arr[n]%1234567;
	    }
}
