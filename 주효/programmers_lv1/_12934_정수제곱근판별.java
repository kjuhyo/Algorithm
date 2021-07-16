package 알고리즘깃;

public class _12934_정수제곱근판별 {
	public long solution(long n) {
        if(n==1) return 4;
        for(long i=1; i<n/2; i++){
            if(i*i==n){
                return (i+1)*(i+1);
            }
        }
        
        return -1;
    }
	
	
}
