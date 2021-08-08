import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue q = new LinkedList<>();
        List<Integer> sol = new ArrayList<>();

        for (int i = 0; i < speeds.length; i++) {
            q.add((int) Math.ceil((100 - progresses[i]) / (double) speeds[i]));
        }

        while (q.size() >= 1) {
            int cnt = 1;
            int now = (int) q.poll();
            if (q.size() == 0) {
                sol.add(1);
                break;
            }
            while (q.size() >= 1) {
                // 뒷 작업들도 끝나있을 때
                if (now >= (int) q.peek()) {
                    cnt++;
                    q.poll();
                    // 리스트의 마지막일 경우
                    if (q.size() == 0) {
                        sol.add(cnt);
                        break;
                    }
                } else {
                    sol.add(cnt);
                    break;
                }
            }
        }

        int[] answer = new int[sol.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = sol.get(i);
        }

        return answer;
    }
}