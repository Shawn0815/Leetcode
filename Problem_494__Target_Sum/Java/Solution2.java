package Problem_494__Target_Sum.Java;

public class Solution2 {

    Integer[][] dp;     // dp 陣列使用 Integer 類型是為了判斷是否已計算過
    int totalSum = 0;   // 計算最大總合，用來做 offset
    
    public int findTargetSumWays(int[] nums, int target) {
        
        int n = nums.length;

        for (int num: nums) {
            totalSum += num;
        }

        // dp 大小為 n * (2 * totalSum + 1)
        // 讓 index 可以從 [-totalSum .. +totalSum] 平移到 [0 .. 2*totalSum]
        dp = new Integer[n][2 * totalSum + 1];

        return backTrack(nums, target, 0, 0);
    }

    // 處理 index i，且總和為 curSum 時，能湊出 target 的組合數
    public int backTrack(int[] nums, int target, int i, int curSum) {

        if (i == nums.length) {
            return curSum == target ? 1 : 0;
        }

        // 如果已經計算過，直接查表使用（記得加 offset）
        if (dp[i][curSum + totalSum] != null) {
            return dp[i][curSum + totalSum];
        }

        // 選擇 1：加正號
        int addWays = backTrack(nums, target, i + 1, curSum + nums[i]);

        // 選擇 2：減負號
        int subWays = backTrack(nums, target, i + 1, curSum - nums[i]);

        // 紀錄 memo
        dp[i][curSum + totalSum] = addWays + subWays;
        return dp[i][curSum + totalSum];
    }
}
