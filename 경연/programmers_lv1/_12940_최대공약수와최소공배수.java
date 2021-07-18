class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
		
		//1. 일단 m까지의 숫까지 하나씩 올리면서 나눠봐야지
		//2. 최대공약수 1이상이고 둘다 나머지가 0일때
		//3. 최소공배수=최대공약수*몫*몫
		int max = Math.max(n, m);
		
		for(int i=1;i<=max;i++) {
			if(n%i==0&&m%i==0) answer[0]=i;
			
		}
		int nres = n/answer[0];
		int mres = m/answer[0];
		
		answer[1] = nres * mres * answer[0];
		
		for(int a: answer) {
			System.out.println(a);
		}
        
        
        
        
        return answer;
    }
}