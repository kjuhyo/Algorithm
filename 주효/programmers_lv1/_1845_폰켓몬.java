package 알고리즘깃;

import java.util.ArrayList;

public class _1845_폰켓몬 {

	public static int solution(int[] nums) {
		ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(list.indexOf(nums[i])<0){
                list.add(nums[i]);
                if(list.size()==nums.length/2) {
                	break;
                }
            }            
        }
        return list.size();
    }

}
