package Problem_55__Jump_Game.Java;

public class Solution3 {
    
    public boolean canJump(int[] nums) {

        int n = nums.length;

        // 用 dp[i] 紀錄從第 i 格是否能走到最後一格
        boolean[] dp = new boolean[n];

        // 初始化：最後一格本身是成功的
        dp[n - 1] = true;

        // 從倒數第二格開始走
        for (int i = n - 2; i >= 0; i--) {
            
            // 最遠距離 = Min(本身能走到的最遠，最後一格）
            int end = Math.min(i + nums[i], n - 1);

            // 嘗試每一個選擇，看那個選擇能否走到最後一格
            // 若可以，dp[i] = true
            for (int j = i + 1; j <= end; j++) {

                if (dp[j] == true) {
                    dp[i] = true;
                    break;
                }
            }
        }

        // 結果：第 0 格開始能否走到最後一格
        return dp[0];
    }
}
