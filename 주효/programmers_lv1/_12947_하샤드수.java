package 알고리즘깃;

public class _12947_하샤드수 {
	public static boolean solution(int x) {
        int sum=0;
	int original=x;
        while(true){
            if(x<10) {
                sum+=x;
                break;
            }
            sum+=x%10;
            x=x/10;
        }
        if(original%sum == 0) return true;
        else return false;
    }
	
}
