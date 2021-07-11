package 알고리즘깃;

public class _42862_체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
        int count = n - lost.length;
		boolean check[] = new boolean[reserve.length];
		boolean lostcheck[] = new boolean[lost.length];

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (!check[j] && lost[i] == reserve[j]) {
					check[j] = true;
					lostcheck[i] = true;
					count++;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (!check[j] && !lostcheck[i]) {
					if (lost[i] == reserve[j] - 1) {
						check[j] = true;
						lostcheck[i]=true;
						count++;
						break;
					} else if (lost[i] == reserve[j] + 1) {
						check[j] = true;
						lostcheck[i]=true;
						count++;
						break;
					}
				}
			}
		}
		return count;
    }
}
