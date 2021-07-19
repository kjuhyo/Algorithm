import java.util.Arrays;
import java.util.Comparator;

class Solution {
    static class Fail {
        int idx;
        double rate;

        Fail(int idx, double rate) {
            this.idx = idx;
            this.rate = rate;
        }
    }

    static double[] stage, clearStage;
    static Fail[] failRate;
    static int answer[], stages[], N;

    public int[] solution(int N, int[] stages) {
        this.N = N;
        this.stages = stages;
        stage = new double[N + 1]; // 도달한 스테이지
        clearStage = new double[N + 1]; // 클리어한 스테이지
        failRate = new Fail[N];
        answer = new int[N];

        stage(N, stages);
        fail();
        sort();

        return answer;
    }

    private static void stage(int N, int[] stages) {
        int tmp = 0;
        for (int i = 0; i < stages.length; i++) {
            tmp = stages[i]; // 도달한 스테이지 인덱스
            if (tmp == 1) {
                stage[1]++;
            } else if (tmp != N + 1) {
                for (int j = 1; j < tmp; j++) {
                    clearStage[j]++;
                    stage[j]++;
                }
                stage[tmp]++;
            } else {
                for (int j = 1; j < tmp; j++) {
                    clearStage[j]++;
                    stage[j]++;
                }
            }
        }
    }

    private static void fail() {
        for (int i = 1; i < N + 1; i++) {
            if (stage[i] == 0) {
                failRate[i - 1] = new Fail(i, 0.0);
            } else {
                failRate[i - 1] = new Fail(i, (stage[i] - clearStage[i]) / stage[i]);
            }
        }
    }

    private static void sort() {
        Comparator<Fail> f = new Comparator<Fail>() {
            public int compare(Fail o1, Fail o2) {
                if (o1.rate == o2.rate) {
                    return Integer.compare(o1.idx, o2.idx);
                }
                return -Double.compare(o1.rate, o2.rate);
            }
        };
        Arrays.sort(failRate, f);
        for (int i = 0; i < N; i++) {
            answer[i] = failRate[i].idx;
        }
    }

}