
public class _68936_쿼드압축후개수세기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int one=0;
	static int zero=0;
	static int map[][];
	public static int[] solution(int[][] arr) {
        int[] answer = new int[2];
        map=arr;
        dfs(0, 0, arr.length);
        answer[0]=zero;
        answer[1]=one;
        return answer;
    }
	
	private static void dfs(int x, int y, int n) {
		if(n==1) {
			if(map[x][y]==1) {
				one++;
			}else {
				zero++;
			}
			return;
		}
		
		if(check(x, y, n)) return;
		
		dfs(x, y, n/2);
		dfs(x+n/2, y, n/2);
		dfs(x, y+n/2, n/2 );
		dfs(x+n/2, y+n/2, n/2);
	}

	private static boolean check(int x, int y, int n) {
		int pick=map[x][y];
		for(int i=x; i<x+n; i++) {
			for(int j=y; j<y+n; j++) {
				if(pick!=map[i][j]) {
					return false;
				}
			}
		}
		
		if(pick==1) one++;
		else zero++;
		return true;
	}

}
