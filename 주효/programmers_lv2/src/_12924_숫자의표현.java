
public class _12924_숫자의표현 {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}
	
	public static int solution(int n) {
        int answer = 0;
        int sum=0;
        int idx=0;
        while(idx<=(n/2+1)){
            sum=0;
            idx++;
            for(int i=idx; i<=n; i++){
            	if(sum==n){
                    answer++;
                    break;
                }
                if(sum>n) break;
                sum+=i;
            }
        }
        return answer+1; //자기자신 경우 포함하므로 +1
    }

}
