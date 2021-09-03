import java.util.*;
public class _67257_수식최대화 {

	public static void main(String[] args) {
		System.out.println(solution("100-200*300-500+20"));
		System.out.println(solution("50*6-3*2"));
	}
	static ArrayList<Long> num;
    static ArrayList<Character> op;
    static boolean check[];
    static char[] isSelected;
    static char[] ch={'-', '+', '*'};
    static long max;
    
    public static long solution(String expression) {
        long answer = 0;
        String s="";
        num=new ArrayList<>(); //expression 내의 숫자
        op=new ArrayList<>(); //expression 내의 부호
        check=new boolean[3];   //순열에 필요
        isSelected=new char[3]; //순열에 필요
        max=0;
        
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i)=='-' || expression.charAt(i)=='+' || expression.charAt(i)=='*'){ //문자이면 연산하려고
                num.add(Long.parseLong(s)); //더해온 s는 숫자로
                op.add(expression.charAt(i)); //부호 넣기
                s="";
            }else{
                s+=expression.charAt(i); //숫자이면 더해
            }
        }
        num.add(Long.parseLong(s)); //마지막 숫자
        perm(0);
        return max;
    }
    
    public static void perm(int idx){ //부호 우선순위 결정하기 위한 순열
        if(idx==3){
            max=Long.max(calc(), max);
            return;
        }
        for(int i=0; i<3; i++){
            if(!check[i]){
                check[i]=true;
                isSelected[idx]=ch[i];
                perm(idx+1);
                check[i]=false;
            }
        }
    }
    
    public static long calc(){
    	
        ArrayList<Long> copyNum=(ArrayList<Long>) num.clone();
        ArrayList<Character> copyOpt=(ArrayList<Character>) op.clone();
        
        for(int i=0; i<isSelected.length; i++){ //부호 순서대로 계산
            for(int j=0; j<copyOpt.size(); j++){
                if(isSelected[i]==copyOpt.get(j)){
                	long ans=0;
                	if(copyOpt.get(j)=='-'){
                        ans=copyNum.get(j)-copyNum.get(j+1);
                    }
                    else if(copyOpt.get(j)=='+'){
                        ans=copyNum.get(j)+copyNum.get(j+1);
                    }
                    else if(copyOpt.get(j)=='*'){
                        ans=copyNum.get(j)*copyNum.get(j+1);
                    }
                	copyNum.remove(j+1); //or copyNum.remove(j);
                    copyNum.set(j, ans);
                    
                    copyOpt.remove(j);
                    j--;
                }    
            }
        } 
        return Math.abs(copyNum.get(0));
    }

}
