class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char phone[] = phone_number.toCharArray();
        for(int i=0;i<(phone_number.length()-4);i++){
            phone[i]='*';
        }
        for(char i:phone){
            answer+=i;
        }
        return answer;
    }
}