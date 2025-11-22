package Problem_45__Jump_Game_II.Java;

public class Solution3 {
    
    public int jump(int[] nums) {

        int n = nums.length;

        // dp[i]：以 i 為起點走到底所需最小步數
        int[] dp = new int[n];

        // 最後一格不用在跳，0 步
        dp[n - 1] = 0;

        // 從倒數第二格開始由右往左計算
        for (int i = n - 2; i >= 0; i--) {

            // 以 i 為起點可到的最遠位置
            int end = Math.min(i + nums[i], n - 1);

            // 初始化最小步數
            int minJump = 10000;

            // 遍歷所有可以跳到的位置，計算所需要的最小步數，取最小值
            for (int j = i + 1; j <= end; j++) {
                minJump = Math.min(minJump, 1 + dp[j]);
            }

            // 紀錄答案
            dp[i] = minJump;
        }

        // 從起點出發到終點的最小步數
        return dp[0];
    }
}
