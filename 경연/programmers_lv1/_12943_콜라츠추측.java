class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt=0;
        double res = num;
//         1-1. 입력된 수가 짝수라면 2로 나눕니다. 
//         1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//         2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
        for(int i=0;i<500;i++){
            if(res==1){
                cnt=i;
                break;
            }
            if(res%2==0){
                res = res/2;
            }else{
                res = (res*3)+1;
            }
        }
        if(res==1){
            answer = cnt;
        }else{
            answer = -1;
        }
        return answer;
    }
}