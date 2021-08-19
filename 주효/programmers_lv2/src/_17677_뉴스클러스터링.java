import java.util.ArrayList;

public class _17677_뉴스클러스터링 {

	public static void main(String[] args) {
		String str1="E=M*C^2";
		String str2="e=m*c^2";
		System.out.println(solution(str1, str2));
	}
	
	 public static double solution(String str1, String str2) {
	        double answer = 0;
	       /* String match = "[^\uAC00-\uD7A3xfea-zA-Z]"; //숫자,공백 제거
	        str1 =str1.replaceAll(match, "");
	        str2 =str2.replaceAll(match, ""); */
	        
	        str1=str1.replaceAll("[^a-zA-Z]","0").toUpperCase();
	        str2=str2.replaceAll("[^a-zA-Z]","0").toUpperCase();
	        
	        //특수문자 제거
	        //String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
			
	        
	        ArrayList<String> list=new ArrayList<>();
	        char c1[]=str1.toCharArray();
	        
	        for(int i=0; i<=str1.length()-2; i++){
	        	if(c1[i]=='0' || c1[i+1]=='0') continue;
	        	else {
	        		String s=Character.toString(c1[i]);
	        		s+=Character.toString(c1[i+1]);
	        		list.add(s);
	        	}
	        }
	        
	        ArrayList<String> compare=new ArrayList<>();
	        char c2[]=str2.toCharArray();
	        
	        for(int i=0; i<=str2.length()-2; i++){
	        	if(c2[i]=='0' || c2[i+1]=='0') continue;
	        	else {
	        		String s=Character.toString(c2[i]);
	        		s+=Character.toString(c2[i+1]);
	        		compare.add(s);
	        	}
	        }
	        
	        int cnt=list.size()+compare.size(); 
	        ArrayList<String> stl=new ArrayList<>();
	        for(int i=0; i<list.size(); i++) {
	        	if(compare.contains(list.get(i))) {
	        		stl.add(list.get(i));
	        		compare.remove(list.get(i));
	        	}
	        }
	        
	        int inter=stl.size();
	        cnt-=inter;

	        if(inter==0 && cnt==0) return 65536;
	        answer=(double)inter/(double)cnt;
	        answer*=65536;
	        return (int)answer;
	    }

}
