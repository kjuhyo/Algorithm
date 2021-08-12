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
        boolean ch[]=new boolean[progresses.length];
        int index=0;
        int bdx=-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(index<progresses.length){
        	for(int i=index; i<progresses.length; i++){
                progresses[i]+=speeds[i];
                if(progresses[i]>=100 && bdx!=i){
                    ch[i]=true;
                    System.out.println("bdx "+bdx);
                    bdx=Math.max(i, bdx);
                    System.out.println("bdx "+bdx);
                    System.out.println("index "+index);
                    System.out.println("----------");
                    int cnt=0;
                    boolean flag=true;
                    for(int idx=index; idx<=bdx; idx++){
                        if(!ch[idx]){
                            flag=false;
                            break;
                        }else {
                        	cnt++;
                        }
                    }
                    if(flag && cnt!=0){
                    	list.add(cnt);
                        index=bdx+1;
                        bdx=-1;
                    }
                    
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
