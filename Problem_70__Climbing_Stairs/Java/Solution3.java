package Problem_70__Climbing_Stairs.Java;

public class Solution3 {
    public int climbStairs(int n) {
        // 用dp陣列紀錄計算過的結果
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        // 後面每次的計算只依賴前兩個計算過的值
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
