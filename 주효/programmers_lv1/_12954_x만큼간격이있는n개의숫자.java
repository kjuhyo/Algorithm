package 알고리즘깃;

public class _12954_x만큼간격이있는n개의숫자 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		// long으로 안바꿔주면(int 상태로 계산하면),
		// x가 int 범위를 벗어났을때 (int)+=(int) -> long 형변환하면 다른 값이 저장됨
		long add = Long.valueOf(x);
		long def = Long.valueOf(x);
		for (int i = 0; i < n; i++) {
			answer[i] = def;
			def += add;
		}
		return answer;
	}
}
