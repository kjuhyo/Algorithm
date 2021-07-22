import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    int tmp = board[i][move - 1];
                    if (list.size() == 0) {
                        list.add(tmp);
                    } else {
                        if (list.get(list.size() - 1) == tmp) {
                            list.remove(list.size() - 1);
                            answer += 2;
                        } else {
                            list.add(tmp);
                        }
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}