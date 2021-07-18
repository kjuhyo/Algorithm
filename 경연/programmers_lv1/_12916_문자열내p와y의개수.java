class Solution {
    boolean solution(String s) {
        boolean answer = false;

        char[] arr = s.toCharArray();
		int cntp = 0;
		int cnty = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='p'||arr[i]=='P')cntp++;
			if(arr[i]=='y'||arr[i]=='Y')cnty++;
		}
		
		if(cntp==cnty||(cntp==0&&cnty==0))
			answer = true;
		
		
        return answer;
    }
}