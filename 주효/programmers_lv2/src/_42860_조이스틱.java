
public class _42860_조이스틱 {
	public static void main(String[] args) {
		System.out.println(solution("JAZ"));
	}
	public static int solution(String name) {
		int answer=0;
		
		//1)알파벳 바꾸기 위한 최소거리(상,하)
		for(int i=0; i<name.length(); i++) {
			//오른쪽으로 이동할때(A에서 Z방향) vs 왼쪽으로 이동할때(Z에서 A방향)중에 이동횟수 짧은것 찾기
			answer+=Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1); //A -> Z로 갈때(뒤로) 한번 이동하므로 +1
		}
		
		//2)커서를 이동시키는 최소거리(좌,우)
		int move=name.length()-1; //일단 이동할 수 있는 최대거리
		for(int i=0; i<name.length(); i++) {
			int next=i+1; //다음 인덱스
			
			while(next<name.length() && name.charAt(next)=='A') { //다음인덱스가 문자열 범위 안넘고 && 다음 문자열이 A라면 
				next++;											// 그냥 이동해야하므로 다음인덱스의 다음인덱스
			}
			
			move=Math.min(move, i+name.length()-next+i); 
		}
		answer+=move; //1)+2) 더한게 값
		return answer;
		
	}
}

	