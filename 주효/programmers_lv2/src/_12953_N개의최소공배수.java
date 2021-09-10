
public class _12953_N개의최소공배수 {
	public int solution(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]<arr[i+1]){
                int tmp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
            }
            int gcd=gcd(arr[i],arr[i+1]);
            int ans=(arr[i]*arr[i+1])/gcd;
            arr[i]=0; arr[i+1]=ans;
        }
        return arr[arr.length-1];
    }
    
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
