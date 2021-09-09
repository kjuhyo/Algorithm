import java.util.Arrays;

public class _12913_땅따먹기 {

	public static int solution(int[][] land) {
		int answer = 0;
		for(int i=1; i<land.length; i++) {
			land[i][0]+=Math.max(Math.max(land[i-1][1], land[i-1][2]),land[i-1][3]);
			land[i][1]+=Math.max(Math.max(land[i-1][0], land[i-1][2]),land[i-1][3]);
			land[i][2]+=Math.max(Math.max(land[i-1][0], land[i-1][1]),land[i-1][3]);
			land[i][3]+=Math.max(Math.max(land[i-1][0], land[i-1][1]),land[i-1][2]);
		
			//열이 4개(작은수)일 경우엔 이렇게도 가능하다.
			if(i==land.length-1) {
				answer=Math.max(Math.max(Math.max(land[i][0],land[i][1]),land[i][2]),land[i][3]);
			}
		}
		return answer;
	}
	
	public static int solution2(int[][] land) {
		int answer = 0;
		for(int i=1; i<land.length; i++) {
			land[i][0]+=Math.max(Math.max(land[i-1][1], land[i-1][2]),land[i-1][3]);
			land[i][1]+=Math.max(Math.max(land[i-1][0], land[i-1][2]),land[i-1][3]);
			land[i][2]+=Math.max(Math.max(land[i-1][0], land[i-1][1]),land[i-1][3]);
			land[i][3]+=Math.max(Math.max(land[i-1][0], land[i-1][1]),land[i-1][2]);	
		}
		
		//만약 열 갯수가 많아서 일일이 Math.max할 수 없는 경우
		int arr[]=land[land.length-1]; //land의 마지막 행
		Arrays.sort(arr);
		answer=arr[arr.length-1];
		return answer;
	}

	public static void main(String[] args) {
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		System.out.println(solution2(land));
	}
}
