package 알고리즘깃;

public class _12901_2016년 {
	public String solution(int a, int b) {
        String answer = "";
        String[] day={"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] date={0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int cal=0;
        for(int i=0; i<a; i++){
            cal+=date[i];
        }
        cal+=b;
        answer=day[cal%7];
        return answer;
    }
}
