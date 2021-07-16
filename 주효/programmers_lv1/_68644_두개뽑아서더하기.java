package 알고리즘깃;

import java.util.ArrayList;
import java.util.Collections;

public class _68644_두개뽑아서더하기 {
	 static int isSelected[];
	    static ArrayList<Integer> list=new ArrayList<>();
	    
	    public int[] solution2(int[] numbers) {
	        ArrayList<Integer> al=new ArrayList<>();
	        for(int i=0; i<numbers.length-1; i++){
	            for(int j=i+1; j<numbers.length; j++){
	                int sum=numbers[i]+numbers[j];
	                //중복제거하고 리스트에 넣는 코드
	                if(al.indexOf(sum)<0){
	                    al.add(sum);
	                }
	            }
	        }
	        Collections.sort(al);
	        int[] answer=new int[al.size()];
	        for(int i=0; i<answer.length; i++){
	            answer[i]=al.get(i);
	        }
	        return answer;
	    }
	    
	    public static int[] solution(int[] numbers) {
	    	 isSelected=new int[2];
	         comb(0, 0, numbers);
	         Collections.sort(list);
	         
	         int[] answer = new int[list.size()];
	         for(int i=0; i<list.size(); i++){
	             answer[i]=list.get(i);
	         }
	         return answer;
	    }
	    
	    public static void comb(int idx, int s_idx, int[] arr){
	        if(s_idx==2){
	            int sum=0;
	            for(int i=0; i<2; i++){
	                sum+=isSelected[i];
	            }
	            //중복제거하고 리스트에 넣는 코드
	            if(list.indexOf(sum)<0) {
	            	list.add(sum);	            	
	            }
	            return;
	        }
	        if(idx==arr.length) return;
	        
	        isSelected[s_idx]=arr[idx];
	        comb(idx+1, s_idx+1, arr);
	        comb(idx+1, s_idx, arr);
	    }
	    
}
