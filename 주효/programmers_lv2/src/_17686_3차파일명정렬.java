import java.util.Arrays;
import java.util.Comparator;

public class _17686_3차파일명정렬 {

	public static void main(String[] args) {
		String[] files = {"img12.png","img10.png","img1.png","IMG01.GIF","img2.JPG"};
		String[] ans=solution(files);
		
		for(String e:ans) {
			System.out.println(e);
		}
	}
	
	public static String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		//숫자앞까지 문자열 자름.
        		String s1=o1.split("[0-9]")[0];
        		String s2=o2.split("[0-9]")[0];
        		
        		int result=s1.toLowerCase().compareTo(s2.toLowerCase());
        		
        		//문자열로 결정할수 없다면
        		if(result==0) {
        			o1=o1.replace(s1, "");
        			o2=o2.replace(s2, "");
        			result=find(o1) - find(o2);
        		}
        		return result;
        	}

        });
        
        return files;
    }
	
	private static int find(String o1) {
		String str="";
		for(char c : o1.toCharArray()) {
			if(Character.isDigit(c)&&str.length()<5) {
				str+=c;
			}else {
				break;
			}
		}
		return Integer.valueOf(str);
	}
}
