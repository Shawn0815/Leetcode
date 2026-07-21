package _416_Partition_Equal_Subset_Sum;

public class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;

        for (int num: nums) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return false;
        }

        int target = totalSum / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num: nums) {
            for (int sum = target - num; sum >= 0; sum--) {
                if (dp[sum] == true) {
                    dp[sum + num] = true;
                }
            }
        }

        return dp[target];
    }
}
