package 알고리즘깃;

import java.util.ArrayList;

public class _12906_같은숫자는싫어 {
	 public int[] solution(int []arr) {
	        ArrayList<Integer> list=new ArrayList<>();
	        
	        int preNum=10;
	        for(int i:arr){
	            if(preNum!=i){
	                list.add(i);
	            }
	            preNum=i;
	        }
	        int[] answer = new int[list.size()];
	        for(int i=0; i<list.size(); i++){
	            answer[i]=list.get(i);
	        }
	        return answer;
	    }
}
