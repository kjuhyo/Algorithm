class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int ans =0; //각자리수의합
        int temp=x; //각자리수로 나누면서 나머지로 얻을애들
        while(true){
            ans +=temp%10; //나머지를 더하고
            temp= temp/10;
            if(temp<10){
                break;
            }
        }
        ans +=temp;
        if(x%ans==0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}