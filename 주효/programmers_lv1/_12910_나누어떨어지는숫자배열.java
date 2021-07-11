package 알고리즘깃;

import java.util.ArrayList;
import java.util.Collections;

public class _12910_나누어떨어지는숫자배열 {
	 public int[] solution(int[] arr, int divisor) {
         ArrayList<Integer> list=new ArrayList<>();
	        
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i]%divisor==0) list.add(arr[i]);
	        }
	        
	        Collections.sort(list);
	        
       if(list.size()==0) {
           int[] answer= {-1};
           return answer;
       }
       else{
	        int[] answer = new int[list.size()];
	        for(int i=0; i<answer.length; i++){
	            answer[i]=list.get(i);
	        }
           return answer;
       }
        
   }
}
