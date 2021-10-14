import java.util.Stack;

public class _76502_괄호회전하기 {

	public static void main(String[] args) {
		System.out.println(solution("}]()[{"));
	}

	public static int solution(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder(s);

		for (int i = 0; i < s.length(); i++) {
			answer += possible(sb);
			sb.insert(s.length(), sb.charAt(0));
			sb.deleteCharAt(0);

		}
		return answer;
	}

	private static int possible(StringBuilder sb) {
		Stack<Character> st = new Stack<>();
		boolean flag = true;
		st.push(sb.charAt(0));

		for (int i = 1; i < sb.length(); i++) {
			if (sb.charAt(i) == ']') {
				if (!st.isEmpty() && st.peek() == '[') {
					st.pop();
				} else {
					flag = false;
					break;
				}
			} else if (sb.charAt(i) == ')') {
				if (!st.isEmpty() && st.peek() == '(') {
					st.pop();
				} else {
					flag = false;
					break;
				}
			} else if (sb.charAt(i) == '}') {
				if (!st.isEmpty() && st.peek() == '{') {
					st.pop();
				} else {
					flag = false;
					break;
				}
			} else {
				st.push(sb.charAt(i));
			}
		}

		if (!flag || !st.isEmpty())
			return 0;
		else
			return 1;
	}
}
