package Problem_338__Counting_Bits.Java;

public class Solution2 {
    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        // offset 代表當前區段的起始 2 的冪次方
        int offset = 1;

        for (int i = 1; i <= n; i++) {
            if (offset * 2 ==i) {
                offset = i; // 更新 offset 為新的 2 的冪
            }

            // i 的二進位 1 的個數 = 去掉最高位的部分 + 1
            // 而去掉最高位的部分是 i - offset
            dp[i] = 1 + dp[i - offset];
        }

        return dp;
    }
}
