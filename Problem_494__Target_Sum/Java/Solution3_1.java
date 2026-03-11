package Problem_494__Target_Sum.Java;

public class Solution3_1 {
    
    public int findTargetSumWays(int[] nums, int target) {
        
        int n = nums.length;
        int totalSum = 0;

        for (int num: nums) {
            totalSum += num;
        }

        // dp[i][curSum] 代表用 i 個數字湊出總和為 curSum 的方法數（記得加 offset）
        int[][] dp = new int[n + 1][2 * totalSum + 1];
        
        // Base case：0 個數字湊出總和為 0，方法一種
        dp[0][0 + totalSum] = 1;

        // 一層一層計算填入所有可能的總合對應的方法
        // i：目前有 i 個數字；j：總和為 j
        for (int i = 1; i <= n; i++) {
            
            for (int j = -totalSum; j <= totalSum; j++) {

                // 前一層湊出總合為 j 的方法數
                int prevWays = dp[i - 1][j + totalSum];

                if (prevWays != 0) {

                    // 選擇加號：總和為 j + nums[i - 1]
                    dp[i][j + nums[i - 1] + totalSum] += prevWays;

                    // 選擇減號：總和為 j - nums[i - 1]
                    dp[i][j - nums[i - 1] + totalSum] += prevWays;
                }
            }
        }

        // 最終答案：用前 n 個數字組出 target
        return dp[n][target + totalSum];
    }
}
