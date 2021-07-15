package 알고리즘깃;

public class _12935_제일작은수제거하기 {
	public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length==1) {
            answer=new int[1];
            answer[0]=-1;
            return answer;
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min=Math.min(min, arr[i]);
        }
        answer=new int[arr.length-1];
        int idx=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=min){
                answer[idx]=arr[i];
                idx++;
            }
        }
        return answer;
    }
}
