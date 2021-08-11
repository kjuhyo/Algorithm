import java.util.Arrays;

public class _42885_구명보트 {
	public int solution(int[] people, int limit) {
        //배열의 맨 처음사람과 맨 마지막사람 더해가며 넣기
        
        //배열을 정렬했으므로
        //더했을때 구명보트 무게 초과하면 맨 마지막 사람은 혼자타야된다는거==cnt++;
        //이 경우 마지막 사람만 그 앞사람으로 바뀜 == people[last--];
        
        //더했을때 구명보트 무게 초과 안하면 둘이 같이 탈수있는거==cnt++;
        //이 경우 처음사람은 그 다음사람, 마지막 사람은 그 앞사람으로 바뀜;
        
        //사람수가 짝수면 start를 늘리고 last를 빼면 결국 교차됨
        //사람수가 홀수면 start를 늘리고 last를 빼면 결국 같아짐
        
        Arrays.sort(people);
        
        int start=0;
        int last=people.length-1;
        int cnt=0;
        
        while(true){
            if(start>last) break; //사람수가 짝수일때
            if(start==last){ //사람수가 홀수일때
                cnt++;
                break;
            }
            if(people[start]+people[last]<=limit){
                cnt++;
                start++;
                last--;
            }else{
                last--;
                cnt++;
            }
        }
        return cnt;
    }
}
