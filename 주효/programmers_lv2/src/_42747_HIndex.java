
public class _42747_HIndex {

	public static int solution(int[] citations) {
        int HIndex = 0;
        int n=citations.length;
        int h=0;
        
        while(h<=n){ //h는 n을 넘을 수 없다 (n편 중 h편 이상이니까)
            int cnt=0; //h번 이상 인용된 논문 갯수
            int not=0; //h번 이하 인용된 논문 갯수
          
            for(int i=0; i<n; i++){
                if(citations[i]>=h) {
                    cnt++;
                }else{
                	not++;
                }
            }
            
            if(cnt>=h && not<=h){ //h번 이상 인용된 논문이 h번 이상, h번 이하 인용된 논문 h번 이하 (문제에서는 설명 부족)
                HIndex=Math.max(HIndex, h);
            }
            
            h++;
        }
        return HIndex;
    }
}
