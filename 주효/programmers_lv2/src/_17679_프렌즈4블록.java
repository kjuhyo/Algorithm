
public class _17679_프렌즈4블록 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	static char[][] friends;
	static boolean[][] check;
	static int dx[]= {0, 1, 1};
	static int dy[]= {1, 0, 1};
	
	public static int solution(int m, int n, String[] board) {
        int answer = 0;
        friends=new char[m][n];
        check=new boolean[m][n];
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		friends[i][j]=board[i].charAt(j);
        	}
        }
        
        int cnt=1;
        for(int i=0; i<m; i++) {
        	for(int j=0; j<n; j++) {
        		if(!check[i][j]) {
        			dfs(i, j, friends[i][j], m, n, cnt);
        		}
        	}
        }
        return answer;
    }
	
	private static void dfs(int x, int y, int pick, int m, int n, int cnt) {
		check[x][y]=true;
		
		for(int i=0; i<3; i++) {
			int nx=x+dx[i];
			int ny=y+dy[i];
			
			if(nx<0 || ny<0 || nx>=m || ny>=n || check[nx][ny]) continue;
			if(friends[nx][ny]!=pick) return;
			if(!check[nx][ny] && friends[nx][ny]==pick) {
				cnt++;
				check[nx][ny]=true;
				dfs(nx, ny, pick, m, n, cnt);
			}
		}
		return;
	}

}
