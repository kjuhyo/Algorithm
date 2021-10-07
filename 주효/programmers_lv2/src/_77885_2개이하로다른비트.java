
public class _77885_2개이하로다른비트 {
	//1) 짝수
    //0010 (2) -> f(x) : 0011 (3)
    //0100 (4) -> f(x) : 0101 (5)
    //즉 , x+1
    
    //2) 홀수
    //0011 (3) -> 0101 (5)
    //0101 (5) -> 0110 (6)
    //0111 (7) -> 1011 (11)
    //즉, 마지막 0이 1로 바뀌고, 그 다음수가 0으로 바뀜
	
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0; i<numbers.length; i++){
            answer[i]=bitResult(numbers[i]);
        }
        return answer;
    }
    
    public static long bitResult(long num){
        if(num%2==0) { 
            return num+1;
        }
        
        String st="0"+Long.toBinaryString(num);
        StringBuilder str=new StringBuilder(st); //문자열연산에서는 StringBuilder가 편하다. //특정인덱스값을 다른 문자로 바꾼다던지 ...
        
        int lastZero=str.lastIndexOf("0");
        str.setCharAt(lastZero, '1');
        str.setCharAt(lastZero+1, '0');
        
        return Long.parseLong(str.toString(),2);
    }
}
