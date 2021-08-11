
public class _12899_124나라의숫자 {
	 public String solution(int n) {
	        String answer[] = {"4", "1", "2"};
	        //1%3=1 -- 배열의 인덱스 --124 나라에서 1
	        //2%3=2 -- 배열의 인덱스 --124 나라에서 2
	        //3%3=0 -- 배열의 인덱스 --124 나라에서 4
	        String s="";
	        while(n>0){
	            int remain=n%3;
	            n=n/3;
	            
	            if(remain==0) n--;
	            s=answer[remain]+s;
	        }
	        return s;
	    }
}
