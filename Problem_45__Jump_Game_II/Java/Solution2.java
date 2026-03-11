package Problem_45__Jump_Game_II.Java;

public class Solution2 {

    Integer[] dp;
    
    public int jump(int[] nums) {
        
        dp = new Integer[nums.length];
        return dfs(nums, 0);
    }

    private int dfs(int[] nums, int i) {

        int n = nums.length;

        if (i == n - 1) {
            return 0;
        }

        // 已經算過，直接查表回傳答案
        if (dp[i] != null) {
            return dp[i];
        }

        int minJump = 10000; 
        int end = Math.min(i + nums[i], n - 1);

        for (int j = i + 1; j <= end; j++) {

            minJump = Math.min(minJump, dfs(nums, j) + 1);
        }

        // 紀錄答案
        dp[i] = minJump;
        return dp[i];
    }
}
