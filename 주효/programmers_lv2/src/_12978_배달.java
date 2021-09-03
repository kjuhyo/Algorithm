
public class _12978_배달 {
//플로이드 와샬 : 모든 거리를 최대로 설정해두고 가장 작은 길로 업데이트. 최단거리 구하기 위해.
//모든 마을에서 모든 마을까지 최단거리구한뒤 1번부터 2~N까지 거리를 K와 비교하며 답을 구한다.
	static int map[][];
    
    public int solution(int N, int[][] road, int K) {
        int answer = 1;
        map=new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                map[i][j]=Integer.MAX_VALUE;
            }
        }
        
        for(int i=0; i<road.length; i++){
            int a=road[i][0];
            int b=road[i][1];
            int c=road[i][2];
            if(map[a][b]>=c){
                map[a][b] = map[b][a] = c;
            }
        }
        
        for(int p=1; p<=N; p++){
            for(int q=1; q<=N; q++){
                for(int r=1; r<=N; r++){
                    if(q==r) continue;
                    if(map[q][p]!=Integer.MAX_VALUE && map[p][r]!= Integer.MAX_VALUE){
                        map[q][r]=Math.min(map[q][r], map[q][p]+map[p][r]);
                    }
                }
            }    
        }
        for(int i=2; i<=N; i++){
            if(map[1][i]<=K) answer++;
        }
        return answer;
    }

}
