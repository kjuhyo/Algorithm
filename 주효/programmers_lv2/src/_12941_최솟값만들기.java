import java.util.Arrays;

public class _12941_최솟값만들기 {
	public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum=0;
        for(int i=0; i<A.length; i++){
            sum+=A[i]*B[B.length-(i+1)];
        }
        return sum;
    }
}
