class Solution {
    public int solution(int n) {
        int answer = 0;
//		시간초과
//		for(int i=2;i<=n;i++) {
//			for(int j=2;j<=i;j++) {
//				if(i%j==0&&i>j) break;
//				if(i==j) answer+=1;
//			}
//		}
		
		//제거해나가라고?
		//자 초기값 false;
		boolean[] ch = new boolean[n+1];
		
		//2부터 소수의 배수들을 하나씩 지워나가
		for(int i=2;i<ch.length;i++) {
			if(ch[i])continue; //이미 제거된거 넘어가
			for(int j=2*i;j<=n;j+=i)ch[j]=true;
		}
		//자 이제 숫자세자
		for(int i=2;i<ch.length;i++) {
			if(!ch[i]) answer++;
		}
		
		
        return answer;
    }
}