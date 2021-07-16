package 알고리즘깃;

import java.util.ArrayList;
import java.util.Collections;

public class _12933_정수내림차순으로배치하기 {
	public long solution(long n) {
        long answer = 0;
        ArrayList<Long> list=new ArrayList<>();
        while(true){
            if(n<10) {
                list.add(n);
                break;
            }
            list.add(n%10);
            n=n/10;
        }
        Collections.sort(list);
        String str="";
        for(int i=list.size()-1; i>=0; i--){
            str+=list.get(i);    
        }
        answer=Long.parseLong(str);
        return answer;
    }
}
