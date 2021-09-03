
public class _62048_멀쩡한사각형 {

	public static void main(String[] args) {
		System.out.println(solution(8,12));
	}
	
	public static long solution(int w, int h) {
        if(h>w){ //gcd 구하기 위해서
            int tmp=h;
            h=w;
            w=tmp;
        }
        
        //w*h=직사각형 전체크기
        //gcd(w,h) = w와 h의 최대 공약수
        
        //대각선은 (3,2) , (6,4) , (9,6) , (12,8) 지점에서 정확히 만난다.
        //x좌표는 3씩 증가, y좌표는 2씩 증가, 4번씩(ㄴㄱ 모양) 반복
        //반복 횟수는 w와 h의 최대공약수와 같다. (다른 직사각형 예시에서도 동일)
        //w=8, h=12, gcd=4 : x좌표가 3씩 증가하는것은 h/gcd, y좌표가 2씩 증가하는것은 w/gcd
        
        //한 ㄴㄱ모양에서 지나가는 칸수 4개=(h/gcd+w/gcd-1)
        //왜냐하면 N*M칸 사각형에서 대각선이 지나가는 칸은 N+M-1 이므로.
        /*(왜냐하면 대각선은 무조건 가로는 N길이, 세로도 M길이 만큼 지나간다.그러므로 N+M
        	그런데 가로로 내려가나, 세로로 내려가면 시작점은 똑같기때문에 중복이라서 -1을 해줌)*/
        
        //따라서 (h/gcd+w/gcd-1) * ㄴㄱ모양반복횟수 = (h/gcd+w/gcd-1) * gcd = h+w-gcd
        
        long answer = (long)w*h-(w+h-gcd(w,h)); //(long)형변환은 테케가 커질경우
        return answer;
    }
    
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

}
