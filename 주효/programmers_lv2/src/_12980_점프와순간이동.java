
public class _12980_점프와순간이동 {
	
	public static int solution(int n) {
		int cnt=1;
        while(true){
            if(n<=2) break;
            if(n%2==0) {
                n=n/2;
            } else {
                n=n-1;
                cnt++;    
            }
            
        }

        return cnt;
    }

}
