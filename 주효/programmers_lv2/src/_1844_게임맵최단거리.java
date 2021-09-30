import java.util.LinkedList;
import java.util.Queue;

public class _1844_게임맵최단거리 {

	static int dx[] = { -1, 1, 0, 0 };
	static int dy[] = { 0, 0, -1, 1 };

	public static int solution(int[][] maps) {
		int n = maps.length;
		int m = maps[0].length;
		boolean[][] check = new boolean[n][m];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		q.add(0);
		check[0][0] = true;

		while (!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= n || ny >= m || nx < 0 || ny < 0) {
					continue;
				}

				else if (!check[nx][ny] && maps[nx][ny] == 1) {
					check[nx][ny] = true;
					maps[nx][ny] = maps[x][y] + 1;
					q.add(nx);
					q.add(ny);
				}
			}
		}

		if (maps[n - 1][m - 1] <= 1)
			return -1;
		return maps[n - 1][m - 1];
	}
}
