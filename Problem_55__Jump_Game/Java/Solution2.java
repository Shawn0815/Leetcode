package Problem_55__Jump_Game.Java;

public class Solution2 {

    // 用 dp[i] 紀錄從 i 開始走是否能成功
    Boolean[] dp;
    
    public boolean canJump(int[] nums) {

        dp = new Boolean[nums.length];
        return dfs(nums, 0);
    }

    private boolean dfs(int[] nums, int i) {

        int n = nums.length;

        if (i == n - 1) {
            return true;
        }

        // 若之前算過，直接查表
        if (dp[i] != null) {
            return dp[i];
        }

        int end = Math.min(i + nums[i], n - 1);

        for (int j = i + 1; j <= end; j++) {

            if (dfs(nums, j)) {
                
                // 將結果存起來
                dp[i] = true;
                return true;
            }
        }

        // 將結果存起來
        dp[i] = false;
        return false;
    }
}
