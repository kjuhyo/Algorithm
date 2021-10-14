
public class _12905_가장큰정사각형찾기 {
	
	//효율성 bad
	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 1, 0 } };
		System.out.println(solution(arr));
	}

	public static int solution(int[][] board) {
		int cnt = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == 1) {
					cnt++;
				}
			}
		}
		int byun = (int) Math.sqrt(cnt);
		boolean flag = false;
		while (byun > 0) {
			for (int i = 0; i <= board.length - byun; i++) {
				for (int j = 0; j <= board[0].length - byun; j++) {
					if (board[i][j] == 1) {
						flag = sol(i, j, board, byun);
						if (flag) {
							return byun * byun;
						}
					}
				}
			}
			byun--;
		}

		return 0;
	}

	private static boolean sol(int x, int y, int[][] board, int byun) {
		for (int i = x; i < x + byun; i++) {
			for (int j = y; j < y + byun; j++) {
				if (i >= board.length || j >= board[0].length)
					return false;
				if (board[i][j] != 1)
					return false;
			}
		}
		return true;
	}

}
