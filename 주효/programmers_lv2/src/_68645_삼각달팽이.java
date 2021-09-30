import java.util.ArrayList;

public class _68645_삼각달팽이 {

	public static void main(String[] args) {
		
	}

	public static int[] solution(int n) {
        int[][] triangle = new int[n][];
        for(int i=0; i<triangle.length; i++) {
        	triangle[i]=new int[i+1];
        }
        
        int x=-1, y=0, idx=1;
        for(int i=0; i<triangle.length; i++) {
        	for(int j=i; j<triangle.length; j++) {
        		if(i%3==0) {
        			x++;
        		}else if(i%3==1) {
        			y++;
        		}else {
        			x--;
        			y--;
        		}
        		triangle[x][y]=idx++;
        	}
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<triangle.length; i++) {
        	for(int j=0; j<triangle[i].length; j++) {
        		list.add(triangle[i][j]);
        	}
        }
        
        int answer[]=new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i]=list.get(i);
        }
        return answer;
    }
}
