
public class _42842_카펫 {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //약수 구하기
        int sero=0, garo=0;
        for(int i=1; i<=yellow; i++){
            if(yellow%i==0){
                sero=i;
                garo=yellow/i;
                
                if(((sero+garo)*2)+4==brown){
                    break;    
                }else continue;
            }
        }
        answer[0]=garo+2; //b가 더 길 수밖에 --> 0번째 칸에
        answer[1]=sero+2;
        return answer;
    }
}
