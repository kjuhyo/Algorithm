class Solution {
    public int[] solution(int[] array, int[][] commands) {
        		int[] answer = new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			int temp = commands[i][1]-commands[i][0]+1;
			int[] tarr = new int[temp];
			for(int j=0;j<temp;j++) {
				tarr[j] = array[(commands[i][0]-1+j)];
			}
			int te=0;
			for(int j=0;j<tarr.length;j++) {
				for(int k=j+1;k<tarr.length;k++) {
					if(tarr[j]>tarr[k]) {
						te= tarr[j];
						tarr[j]=tarr[k];
						tarr[k]= te;
					}else {
						
					}
				}
			}
			

			answer[i]=tarr[commands[i][2]-1];

		}
        return answer;
    }
}