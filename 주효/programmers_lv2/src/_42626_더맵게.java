import java.util.Arrays;
import java.util.PriorityQueue;

public class _42626_더맵게 {

	//PriorityQueue로 힙을 구현할 수 있다.
	//우선순위큐는 작은 수가 우선시되게 구현되어 있다.
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,9,10,12};
		int k=7;
		System.out.println(solution(arr,7));
		
	}
	
	public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        int cnt=0;
        while(pq.peek()<K){
            if(pq.size()==1) return -1;
            int first=pq.poll();
            int second=pq.poll();
                
            pq.add(first+second*2);
            cnt++;
        }
        return cnt;
	}
	
	//배열로 해결해보려했지만 효율성 bad(시간초과) & 틀린값이 나오기도
	/*public static int solution(int[] scoville, int K) {
        Arrays.sort(scoville);
        int idx=0;
        for(idx=0; idx<scoville.length; idx++){
            if(scoville[idx]>=K){
                break;
            }
        }
        int s[]=Arrays.copyOf(scoville,idx+1);
        
        boolean flag=true;
        int cnt=0;
        while(true){
            if(!flag) break;
            flag=false;
            for(int i=0; i<s.length-1; i++){
                if(s[i]==0) continue;
                if(s[i]<K){
                    s[i+1]=s[i]+(s[i+1]*2);
                    s[i]=0;
                    cnt++;
                    flag=true;
                    break;
                }
            }
            Arrays.sort(s);
        }
        return cnt;
    }
*/
}
