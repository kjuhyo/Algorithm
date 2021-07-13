class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double ans = 0;
        for(int i:arr){
            ans+=i;
        }
        answer = ans/arr.length;
        return answer;
    }
}