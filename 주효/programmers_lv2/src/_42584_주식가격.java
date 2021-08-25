
public class _42584_주식가격 {

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
        for(int i=0; i<prices.length-1; i++){
            int cnt=0;
            for(int idx=i+1; idx<prices.length; idx++){
                if(prices[idx]<prices[i]){ //주식값 떨어지면
                    cnt++;
                    break;
                }else cnt++;
            }
            answer[i]=cnt;
        }
        answer[prices.length-1]=0;
        return answer;
    }
}
