package 알고리즘깃;

public class _42748_K번째수 {
	
	public int[] solution(int[] array, int[][] commands) {
    
		int size=commands.length;
        int j=0;
        int[] answer=new int[size];
        
        while(j<size){
            int[] number=new int[3];
            for(int i=0; i<3; i++){
                number[i]=commands[j][i];
            }
            
            int[] data=new int[number[1]-number[0]+1];
            int k=0;
            for(int i=number[0]-1; i<=number[1]-1; i++){
                data[k]=array[i];
                k++;
            }
            quicksort(data, 0, data.length-1);
            
            answer[j]=data[number[2]-1];
            j++;
        }
        
        return answer;
       
    }
     
    public void quicksort(int[] data, int start, int end){
        int leftcursor=start;
        int rightcursor=end;
        int pivot=data[(leftcursor+rightcursor)/2];
        
        do{
            while(data[leftcursor]<pivot) leftcursor++;
            while(pivot<data[rightcursor]) rightcursor--;
            if(leftcursor<=rightcursor){
                swap(data, leftcursor++, rightcursor--);
            }
        }while(leftcursor<=rightcursor);
        
        if(start<rightcursor) quicksort(data, start, rightcursor);
        if(leftcursor<end) quicksort(data, leftcursor, end);
    }
    
    public void swap(int[] data, int p, int q){
        int tmp=data[p];
        data[p]=data[q];
        data[q]=tmp;
    }
}
