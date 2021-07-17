class Solution {
    public long solution(long n) {
        long answer = 0;
        
        		//1. 무한반복으로 제곱수를 만들어서 n 값이랑 비교하닥 커지면 멈춰버려
		//2. 있으면 멈춰 +1해서 제곱수 찾아 없으면 -1 출력
		
		int num = 1;
		while(true) {
			long com = (long) Math.pow(num, 2);
			if(com == n) {
				answer = (long) Math.pow((num+1), 2);
				break;
			}else if(com>n) {
				answer= -1;
				break;
			}else {
				num ++;
			}
		}
		
        
        return answer;
    }
}