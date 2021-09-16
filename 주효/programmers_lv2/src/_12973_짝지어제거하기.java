import java.util.Stack;

public class _12973_짝지어제거하기 {
	public static void main(String[] args) {
		System.out.println(solution("cdcd"));
	}

	public static int solution(String s) {

		Stack<Character> stack=new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			}
			else if(stack.peek()==s.charAt(i)) {
				stack.pop();
			}else {
				stack.push(s.charAt(i));
			}
		}
		
		if(stack.size()==0) return 1; 
		return 0;
	}
}
