import java.util.LinkedList;
import java.util.Queue;

public class _17680_캐시 {

	public static void main(String[] args) {
		String[] s= {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		System.out.println(solution(5, s));
	}
	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;
		Queue<String> q=new LinkedList<>();
        
        for(int i=0; i<cities.length; i++){
            cities[i]=cities[i].toUpperCase();
            if(!q.isEmpty() && cacheSize!=0){
            	if(!q.contains(cities[i])){
                    if(q.size()==cacheSize){
                        q.poll();
                    }
                    q.add(cities[i]);
                    answer+=5;
                }else {
                	q.remove(cities[i]);
                	q.add(cities[i]);
                    answer+=1;
                }
            }else{
                q.add(cities[i]);
                answer+=5;
            }
        }
        return answer;
    }

}
