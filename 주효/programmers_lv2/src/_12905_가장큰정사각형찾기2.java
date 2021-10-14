
public class _12905_가장큰정사각형찾기2 {
	
	//효율성 good => dp 이용
	public static int solution(int [][]board)
    {
        int ans=0;
        int [][]newBoard = new int[board.length+1][board[0].length+1];
        for(int i=1; i<newBoard.length; i++){
            for(int j=1; j<newBoard[0].length; j++){
                newBoard[i][j]=board[i-1][j-1];
            }
        }
        for(int i=1; i<newBoard.length; i++){
            for(int j=1; j<newBoard[i].length; j++){
                if(newBoard[i][j]==1){
                   newBoard[i][j]=Math.min(Math.min(newBoard[i][j-1], newBoard[i-1][j]), newBoard[i-1][j-1])+1;
                   ans=Math.max(ans, newBoard[i][j]); 
                }
            }
        }
        return ans*ans;
    }

}
