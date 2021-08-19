import java.util.ArrayList;
import java.util.HashMap;

public class _42578_위장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr= {{"yellowhat","headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
		String[][] brr= {{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup", "face"}};
		System.out.println(solution(brr));
	}

	//예를들어 옷의 종류가 4개이고 각 종류별 갯수는 m,p,k,o라고 했을때,
	//조합할 수 있는 갯수는 (m+1)*(p+1)*(k+1)*(o+1)이다.
	//그런데 한개도 안입는 경우는 없으므로 마지막에 -1 해준다.
	
	public static int solution(String[][] clothes) {
		HashMap<String, Integer> map=new HashMap<>();
		
		for(int i=0; i<clothes.length; i++) {
			if(!map.containsKey(clothes[i][1])) {
				map.put(clothes[i][1],1);
			}else {
				map.put(clothes[i][1], map.get(clothes[i][1]) + 1); //value값을 +1 한값으로 덮어씌움.
			}
		}
		
		int answer=1;
		//map값들은 순서가 없어서 for(int i=0...)문으로 구할수 없다. 키를 넣고 키셋메소드 이용.
		for(String keys : map.keySet()) {
			answer *= map.get(keys)+1;
		}
		return answer-1;
	}
	
	//답은 대부분 맞지만, 효율성 bad(시간초과)
	 	/*
		static boolean check[];
	    static int N, cnt;
	    static HashMap<String, String> hm;
	    static String[] arr;
	    
	    public static int solution(String[][] clothes) {
	        int answer = 0;
	        N=clothes.length;
	        arr=new String[N];
	        for(int i=0; i<clothes.length; i++){
	            arr[i]=clothes[i][1];
	        }
	        check=new boolean[N];
	        cnt=0;
	        powerSet(0,0);
	        return cnt;
	    }
	    
	    public static void powerSet(int idx, int s_idx){
	        if(s_idx==N){
	            hm=new HashMap<>();
	            for(int i=0; i<check.length; i++){
	            	if(check[i]) {
	            		if(!hm.containsValue(arr[i])){
	            			hm.put(arr[i], arr[i]);
	            		}else return;
	            	}
	            }
	            
	            if(hm.size()==0) return;
	            else cnt++;
	            return;
	        }
	        if(idx==N) return;
	        
	        check[s_idx]=true;
	        powerSet(idx+1, s_idx+1);
	        check[s_idx]=false;
	        powerSet(idx+1, s_idx+1);
	    }*/
}
