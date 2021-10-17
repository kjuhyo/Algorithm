import java.util.ArrayList;

public class _12949_행렬의곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1= {{1,4},{3,2},{4,1}};
		int[][] arr2= {{3,3},{3,3}};
		int[][] result=solution(arr1, arr2);
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j]+' ');
			}System.out.println();
		}
	}
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
        
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<arr2[0].length; i++){
            for(int j=0; j<arr2.length; j++){
                list.add(arr2[j][i]);
            }
        }
        int arr3[][]=new int[arr2[0].length][arr2.length];
        int idx=0;
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[0].length; j++){
                arr3[i][j]=list.get(idx);
                idx++;
            }
        }
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[0].length; j++){
                System.out.print(arr3[i][j]+" ");
            }System.out.println();
        }
        
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            int sum=0;
            for(int j=0; j<arr1[0].length; j++){
                sum+=arr1[i][j]*arr3[i][j];
            }
            l.add(sum);
        }
        
        int index=0;
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                answer[i][j]=l.get(index);
                index++;
            }
        }
        return answer;
    }

}
