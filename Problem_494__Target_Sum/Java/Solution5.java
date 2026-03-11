package Problem_494__Target_Sum.Java;

public class Solution5 {
    
    public int findTargetSumWays(int[] nums, int target) {

        int totalSum = 0;

        for (int num: nums) {
            totalSum += num;
        }

        if ((totalSum + target) % 2 != 0 || Math.abs(target) > totalSum) {
            return 0;
        }

        int P = (totalSum + target) / 2;

        int[] dp = new int[P + 1];
        dp[0] = 1;

        for (int num: nums) {

            for (int j = P; j >= num; j--) {

                dp[j] = dp[j] + dp[j - num];
            }
        }

        return dp[P];
    }
}
