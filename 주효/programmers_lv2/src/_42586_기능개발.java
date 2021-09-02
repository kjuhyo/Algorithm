import java.util.ArrayList;

public class _42586_기능개발 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses= {95, 90, 99, 99, 80, 99};
		int[] speeds= {1, 1, 1, 1, 1, 1};
		
		int[] result= solution(progresses,speeds);
		for(int e:result) {
			System.out.println(e);
		}
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int day=0;
        for(int i=0; i<speeds.length; i++){
            day=(int)Math.ceil((double)(100-progresses[i])/speeds[i]);
            //나의 착각 : ceil을 쓰면 올림이므로 (int)Math.ceil(9/2)=5일거라고 생각.
            //그런데 답은 4가 나옴
            //왜냐, 9/2로 이미 int형 4가 나온상태에서 올림해봤자 4임.
            //이건 floor(내림), ceil(올림), round(반올림) 모두 동일.
            //그래서 무조건 double형으로 먼저 계산한 후에 내림/올림/반올림 해야함
            //즉 (int)Math.ceil((double)9/2) 이렇게.
            
            speeds[i]=day;
        }
        
        int pick=speeds[0];
        int cnt=1;
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=1; i<speeds.length; i++){
            if(pick>=speeds[i]){
                cnt++;
            }else{
                list.add(cnt);
                cnt=1;
                pick=speeds[i];
            }
        
            if(i==speeds.length-1){
                list.add(cnt);
            }
        }
        
        int answer[]=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
