import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class _72412_순위검색 {

	static HashMap<String, ArrayList<Integer>> map;
	static ArrayList<Integer> list;

	public static void main(String[] args) {
		String[] info= {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query= {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		int[] arr=solution(info, query);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        map=new HashMap<>();
        
        for(int i=0; i<info.length; i++) {
        	dfs("", 0, info[i].split(" "));
        }
        
        //map에 저장된 점수 list 오름차순으로 정렬
        ArrayList<String> l=new ArrayList<>(map.keySet());
        for(int i=0; i<l.size(); i++) {
        	ArrayList<Integer> score=map.get(l.get(i));
        	Collections.sort(score);
        }
        
        for(int i=0; i<query.length; i++) {
        	query[i]=query[i].replaceAll(" and ", "");
        	String[] str=query[i].split(" ");
        	int score=Integer.parseInt(str[1]);
        	
        	answer[i]=search(str[0], score);
        }
        return answer;
    }

	private static int search(String str, int score) {
		if(!map.containsKey(str)) return 0;
		ArrayList<Integer> scoreList=map.get(str);
		int start=0;
		int end=scoreList.size()-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(scoreList.get(mid)<score) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return scoreList.size()-start;
	}

	private static void dfs(String pos, int idx, String[] info) {
		// TODO Auto-generated method stub
		if(idx==4) {
			if(!map.containsKey(pos)) {
				list=new ArrayList<>();
				list.add(Integer.parseInt(info[4])); //점수 넣어주기
				map.put(pos, list);
			}else {
				map.get(pos).add(Integer.parseInt(info[4]));
			}
			return;
		}
		
		dfs(pos+"-", idx+1, info);
		dfs(pos+info[idx], idx+1, info);
		
	}
	
	
}
