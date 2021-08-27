
public class _42860_조이스틱 {
	public static void main(String[] args) {
		System.out.println(solution("AABAAAAAAA"));
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
			 
			int temp = next == name.length() ? i : i+name.length() -next +i;
			//next == name.length() : next가 끝까지 갔다면
			//i : 그대로 같은 방향으로 이동한거임
			//끝까지 안갔다면
			//i+name.length() -next +i : 예로 AABBAAAAAB의 경우, 시작점에서 오른쪽으로 이동해 3,4번째 B변경 후 뒤로 돌아간뒤 맨마지막 B변경이 최소거리이므로
			//							i만큼 다시 되돌아가게됨. 이런경우를 위해 i+i. 거기에 전체길이에서 A가 아닌문자의 총길이 더해줌
            move = Math.min(move, temp);
		}
		answer+=move; //1)+2) 더한게 값
		return answer;
	}
}

	