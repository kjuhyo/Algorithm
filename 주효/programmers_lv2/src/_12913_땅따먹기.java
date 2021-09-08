
public class _12913_땅따먹기 {
	static int dx[]={-1,1,0,0};
    static int dy[]={0,0,-1,1};
    static boolean check[][];
    static int[][] map;
    static int sum, max;
    
    public static int solution(int[][] land) {
        int answer = 0;
        map=land;
        check=new boolean[map.length+1][4];
        
        sum=0; max=0;
        for(int i=0; i<4; i++){
            dfs(i, 0);   
        }
        return max;
    }
    
    public static void dfs(int x, int y){
        check[x][y]=true;
        
        for(int i=0; i<4; i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            
            if(nx<0 || ny<0 || nx>=map.length || ny>=4) return;
            
            else if(nx==map.length-1) {
                check[nx][ny]=true;
                sum+=map[nx][ny];
                max=Math.max(sum, max);
                return ;
            }
            
            else if(!check[nx][ny] && x != nx && y!=ny){
                check[nx][ny]=true;
                sum+=map[nx][ny];
                dfs(nx, ny);
                check[nx][ny]=false;
            }
            
        }
        return;
    }
	    
	    public static void main(String[] args) {
	    	int[][] land= {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
			System.out.println(solution(land));
		}
}
