
public class _49993_스킬트리 {

	public static void main(String[] args) {
		String arr[]= {"BACDE", "CBADF", "AECB", "BDA"};
		String s="CBD";
		System.out.println(solution(s,arr));
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int t=0; t<skill_trees.length; t++){
            String st=skill_trees[t];
            int idx=0; int currentLength=0;
            String s="";
           out: for(int i=0; i<skill.length(); i++){
                for(int j=idx; j<st.length(); j++){
                    if(skill.charAt(i)==st.charAt(j)){
                        currentLength++;
                        s+=st.charAt(j);
                        if(skill.substring(0,currentLength).equals(s)){
                        	idx=j;
                            break;
                        }else{
                            break out;
                        }
                    }
                }
               if(skill.equals(s)){
                  answer++;
               }else {
                   if(skill.contains(s)) answer++;
               }
            }
        }
        return answer;
    }

}
