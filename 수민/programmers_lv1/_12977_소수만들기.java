class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int h = j + 1; h < nums.length; h++) {
                    int sum = nums[i] + nums[j] + nums[h];
                    if (isTrue(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean isTrue(int sum) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(sum); i++) {
            if (sum % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}