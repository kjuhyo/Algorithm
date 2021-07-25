class Solution {
	static boolean flag;
    public String solution(String p) {
        String answer = "";
        
        int uIdx = 0, diff = 0;

		if(p.length() == 0) {
			return null;
		}
		
		if(chkRight(p)) return p;
		
		for (int i = 0; i < p.length(); i++) {
			if(p.charAt(i)=='(') {
				diff++;
			}else {
				diff--;
			}
			if(diff==0) { // 균형 맞음
				uIdx = i;
				break;
			}	
		}
		String u = p.substring(0,uIdx+1);
		String v = p.substring(uIdx+1);
		//System.out.println("p: "+p+" u: "+u);
		//System.out.println("p: "+p+" v: "+v);
		
		if(chkRight(u)) {
			//System.out.println("chkRight start!!!");
			answer = u;
			answer = answer.concat(solution(v));
		}else {
			//System.out.println("makeU p: "+p+" u: "+u+" v: "+v);
			if(uIdx==p.length()-1) {
				answer = makeU(u);
			}else {
				answer = makeU(u,v);
			}
			//System.out.println("출력할str "+answer);
			return answer;
		}
        
        
        return answer;
    }
    
    public String makeU(String u) {
		//System.out.println("v null makeU");
		String str ="()";
		u = u.substring(1,u.length()-1);
		u = u.replace("(", ":");
		u = u.replace(")", "(");
		u = u.replace(":", ")");
		str = str.concat(u);
			
		return str;
	}
    
    public String makeU(String u, String v) {
		
		
		String str ="(";
		str = str.concat(solution(v));
		str = str.concat(")");
		//System.out.println("makeU 윗부분 "+str);
		
		u = u.substring(1,u.length()-1);
		//System.out.println("1 "+u);
		u = u.replace("(", ":");
		u = u.replace(")", "(");
		u = u.replace(":", ")");
		//System.out.println("2 "+u);
		str = str.concat(u);
		//System.out.println("makeU 끝 "+str);
		
		return str;
		
	}

    public boolean chkRight(String p) {
		flag = true;
		
		if(p.charAt(0)==')') return false; // 무조건 열린 괄호부터 시작해야 올바른 괄호 문자열
		
		int chk = 1; // 첫 시작은 열린 괄호
		for (int i = 1; i < p.length(); i++) { // 닫힘이 더 많이 나오는 순간 올바르지 않음 chk 증감 해서 더 많이 나오면 false
			if(p.charAt(i)=='(')
				chk++;
			else
				chk--;
			if(chk<0) return false;
		}
		return flag;
	}
}