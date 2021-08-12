import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class _42577_전화번호목록 {
	public boolean solution(String[] phone_book) {
		 //문자열 길이순으로 정렬
        Arrays.sort(phone_book, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                return s1.length()-s2.length();
            }
        });
        
        //효율성 3,4번에서 걸림
       /*for(int i=0; i<phone_book.length-1; i++){
           int l=phone_book[i].length();
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[j].equals(phone_book[i].substring(0,l))){
                    return false;
                }
            }
        }*/
        
        Map<String, String> map=new HashMap<>();
		for(int i=0; i<phone_book.length; i++) {
			map.put(phone_book[i], phone_book[i]);
		}
		
		for(int i=0; i<phone_book.length; i++){ //배열을 쫙 돌아
            for(int idx=0; idx<phone_book[i].length(); idx++){//기준이 되는 북[i] 길이만큼
                String s=phone_book[i].substring(0, idx);
                if(map.containsKey(s)){
                    return false;
                }
            }
		}
        
        return true;
    }
}
