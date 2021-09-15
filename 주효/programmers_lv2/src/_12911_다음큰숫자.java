
public class _12911_다음큰숫자 {
	public int solution(int n) {
        String binaryN=Integer.toBinaryString(n);
        int cntN=0;
        for(int i=0; i<binaryN.length(); i++){
            if(binaryN.charAt(i)=='1'){
                cntN++;
            }
        }
        
        int num=n+1;
        
        while(true){
            String binary=Integer.toBinaryString(num);
            int cnt=0;
            for(int i=0; i<binary.length(); i++){
                if(binary.charAt(i)=='1'){
                    cnt++;
                }
            }
            if(cnt==cntN){
                break;
            }
            num++;
        }
        return num;
    }
}
