package Problem_70__Climbing_Stairs.Java;

public class Solution2 {
    // 用dp陣列紀錄計算過的結果
    private int[] dp;

    public int climbStairs(int n) {
        // 初始化dp陣列
        dp = new int[n + 1];

        // 處理基礎情況
        dp[1] = 1;
        dp[2] = 2;

        return climb(n);
    }

    // helper function: 純粹處理地回邏輯
    private int climb(int n) {
        // 若dp[n]已經計算過，直接return，避免重複運算
        if (dp[n] != 0) {
            return dp[n];
        }

        // 沒算過，進行地回運算，並做紀錄
        dp[n] = climb(n - 1) + climb(n - 2);

        return dp[n];
    }
}
