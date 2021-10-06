
public class _12985_예상대진표 {
	public int solution(int n, int a, int b)
    {
        if(a>b) {
            int tmp=a;
            a=b;
            b=tmp;
        }
        
        int cnt=1;
       
        while(true){
            if(a%2==1 && b-a==1) break;
            
            a=(a+1)/2;
            b=(b+1)/2;
            cnt++;
        }
        
        return cnt;
    }
}
