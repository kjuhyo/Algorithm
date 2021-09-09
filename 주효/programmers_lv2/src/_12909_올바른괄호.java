import java.util.Stack;

public class _12909_올바른괄호 {
	boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        if(!st.isEmpty()) return false;
        return answer;
    }
}
