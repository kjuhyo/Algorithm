import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _49993_스킬트리 {

	public static void main(String[] args) {
		String arr[] = { "BACDE", "CBADF", "AECB", "BDA" };
		String s = "CBD";
		System.out.println(solution(s, arr));
	}

	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for (int t = 0; t < skill_trees.length; t++) {
			String st = skill_trees[t];
			String s = "";

			Queue<Character> q = new LinkedList<>();
			for (int i = 0; i < skill.length(); i++) {
				q.add(skill.charAt(i));
			}

			int idx = 0;
			for (int j = idx; j < st.length(); j++) {
				if (q.size() != 0) {
					if (st.charAt(j) == q.peek()) {
						q.poll();
						idx = j;
					}
				}
			}

			if (q.size() == 0) {
				answer += 1;
			} else {
				boolean flag = true;
				out: while (!q.isEmpty()) {
					for (int j = 0; j < st.length(); j++) {
						if (q.peek() == st.charAt(j)) {
							flag = false;
							break out;
						}
					}
					q.poll();
				}

				if (flag) {
					answer += 1;
				}

			}

			q.clear();
		}

		return answer;
	}

}
