import java.util.ArrayList;
import java.util.HashMap;

public class _42890_후보키 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr= {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}}; 
		System.out.println(solution(arr));
	}
	
	static boolean check[];
    static String[][] rel;
    static ArrayList<String> hubokey;
    public static int solution(String[][] relation) {
        check=new boolean[relation[0].length];
        rel=relation;
        hubokey=new ArrayList<>();
        powerSet(0);
        return hubokey.size();
    }
    
    public static void powerSet(int idx){ //가능한 부분집합 구하기
        if(idx==check.length){
            String s="";
            for(int i=0; i<check.length; i++){
                if(check[i]) {
                    s+=String.valueOf(i);
                }
            }
            if(s.equals("")) return; //공집합은 무의미
            
            if(!hubokey.isEmpty()){
                for(int i=0; i<hubokey.size(); i++){
                    String hubo=hubokey.get(i);
                    boolean flag=false;
                    for(char c:hubo.toCharArray()) {
                        //이 조합의 컬럼이 후보키리스트의 컬럼에 없다면
                    	if(!s.contains(String.valueOf(c))) {
                    		flag=true; //후보키 되는지 확인해보자
                    		break;
                    	}
                    }
                    if(!flag) return; //후보키리스트 컬럼에 모두 있다면 이 컬럼조합은 유일성을 만족하지 못하므로 리턴.
                }
            }
            
            //유일성 만족하는지 확인
            HashMap<String, Integer> map=new HashMap<>();
            String[] arrS=s.split(""); //컬럼조합 분해
            //모든행 돌아보면서 유일한지 찾을거임.
            for(int i=0; i<rel.length; i++){
                String s2="";
                for(int j=0; j<arrS.length; j++){
                    s2+=rel[i][Integer.valueOf(arrS[j])];
                }
                if(map.get(s2)==null) map.put(s2,1); //유일하다
                else return; //유일하지 않다면 리턴
            }
            hubokey.add(s); //유일하므로 후보키 리스트에 넣쟝!
            return;
        }
        
        check[idx]=false;
        powerSet(idx+1);
        check[idx]=true;
        powerSet(idx+1);
    }

}
