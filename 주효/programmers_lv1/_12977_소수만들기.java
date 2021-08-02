package 알고리즘깃;

public class _12977_소수만들기 {

	static int isSelected[];
    static int count;
    public static int solution(int[] nums) {
        isSelected=new int[nums.length];
        count=0;
        comb(0,0, nums);
        return count;
    }
    
    public static void comb(int idx, int s_idx, int[] nums){
        if(s_idx==3){
            int sum=0;
            for(int i=0; i<isSelected.length; i++){
                sum+=isSelected[i];
            }
             
            if(isPrime(sum)==1) { //소수인지 확인
            	count++;
            }
            return ;
        }
        
        if(idx==nums.length) return ;
        
        isSelected[s_idx]=nums[idx];
        comb(idx+1, s_idx+1, nums);
        comb(idx+1, s_idx, nums);
    }

	private static int isPrime(int sum) { //소수인지 확인
		boolean flag=true;
        for(int i=2; i<sum; i++){
            if(sum%i==0) {
                flag=false;//소수가 아님
                break;
            }
        }
        if(!flag) return 0;
        else return 1;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,7,6,4};
		System.out.println(solution(arr));

	}


}
