package 알고리즘깃;

public class _42746_가장큰수 {

	 static boolean check[];
	    static long isSelected[];
	    static long max;
	    
	    public static String solution(int[] numbers) {
	        max=0;
	        check=new boolean[numbers.length];
	        isSelected=new long[numbers.length];
	        perm(0, numbers);
	        return Long.toString(max);
	    }
	    
	    public static void perm(int idx, int[] numbers){
	        if(idx==numbers.length){
	            String s="";
	            for(int i=0; i<numbers.length; i++){
	                s+=Long.toString(isSelected[i]);
	            }
	            long k=Long.parseLong(s);
	            max=Math.max(max, k);
	            return;
	        }
	        
	        for(int i=0; i<numbers.length; i++){
	            if(!check[i]){
	                check[i]=true;
	                isSelected[idx]=numbers[i];
	                perm(idx+1, numbers);
	                check[i]=false;
	            }
	        }
	        return;
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr= {6,10,2};
		System.out.println(solution(arr));

	}

}
