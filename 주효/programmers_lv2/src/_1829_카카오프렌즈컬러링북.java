import java.util.LinkedList;
import java.util.Queue;

public class _1829_카카오프렌즈컬러링북 {

	static boolean check[][];
    static int map[][];
    static int dx[]={-1, 1, 0, 0};
    static int dy[]={0, 0, -1, 1};
    
    public int[] solution(int m, int n, int[][] picture) {
        map=picture;
        check=new boolean[m][n];
        
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!check[i][j] && map[i][j]!=0) {
                    numberOfArea++;
                    int count=bfs(i, j);
                    maxSizeOfOneArea=Math.max(count, maxSizeOfOneArea);
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public static int bfs(int x, int y){
        Queue<Integer> q=new LinkedList<>();
        q.add(x); q.add(y);
        int pick=map[x][y];
        check[x][y]=true;
        
        int count=1;
        while(!q.isEmpty()){
            x=q.poll();
            y=q.poll();
            
            for(int i=0; i<4; i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                
                if(nx<0 || ny<0 || nx>=map.length || ny>=map[0].length){
                    continue;
                }
                
                if(!check[nx][ny] && map[nx][ny]==pick){
                    count++;
                    check[nx][ny]=true;
                    q.add(nx); q.add(ny);
                }
            }
        }
        return count;
    }
}
