package 알고리즘깃;

public class _12940_최대공약수와최소공배수 {
	public int[] solution(int n, int m) {
        int num=gcd(n, m);
        int[] answer = {num, n*m/num};
        return answer;
    }
    public int gcd(int n, int m){
        if(n<m){
            int tmp=n;
            n=m;
            m=tmp;
        }
        if(m==0) return n;
        else return gcd(m, n%m);
    }
}
