import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _12939_최댓값과최솟값 {

	public static void main(String[] args) {
		System.out.println(solution("-1 -2 -3 -4"));
	}
	public static String solution(String s) {
        String answer="";
        ArrayList<Integer> list=new ArrayList<>();
        String[] str=s.split(" ");

        for(int i=0; i<str.length; i++){
        	list.add(Integer.parseInt(str[i]));
        }
        Collections.sort(list);
        answer=Integer.toString(list.get(0))+" "+Integer.toString(list.get(list.size()-1));
        return answer;
    }

}
