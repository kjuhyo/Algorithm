package 알고리즘깃;

import java.util.ArrayList;

public class _68935_3진법뒤집기 {

	public static void main(String[] args) {
		System.out.println(solution(125));
	}
	
	public static int solution(int n) {
        int mok=n;
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            if(mok<3){
                list.add(mok);
                break;
            }
            list.add(mok%3);
            mok=mok/3;
        }
       
        int sum=0;
        int idx=0;
        for(int i=list.size()-1; i>=0; i--){
            sum+=list.get(i)*Math.pow(3, idx);
            System.out.println(sum);
            idx++;
        }
        return sum;
    }

}
