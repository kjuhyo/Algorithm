class Solution {
    public int[] solution(long n) {
        
        		//1. 자릿수만큼 배열만들어서
		//2. 나머지대로 앞에서부터 넣기
		
		int num = (int) (Math.log10(n)+1);
		int[] answer = new int[num];
		
		for(int i=0;i<num;i++) {
			int temp = (int) (n%10);
			answer[i] = temp;
			n = n/10;
			
		}
        
        
        
        return answer;
    }
}