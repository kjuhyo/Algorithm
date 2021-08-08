
public class _43165_Å¸°Ù³Ñ¹ö {
	public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, target, 0);
        return answer;
    }
    public static int dfs(int[] numbers, int idx, int target, int sum){
        if(idx==numbers.length) {
            if(sum==target) return 1;
            else return 0;
        }
        return dfs(numbers, idx+1, target, sum+numbers[idx])+dfs(numbers,idx+1,target, sum-numbers[idx]);
    }
}
