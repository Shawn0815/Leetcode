package Problem_338__Counting_Bits.Java;

public class Solution3 {
    public static int[] countBits(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0; // base: 0 的二進位是 0，1 的個數為 0

        for (int i = 1; i <= n; i++) {
            // 一個數字的 1 的個數 = 它右移一位後的結果的個數 +如果它最後一位是1，就多1
            dp[i] = dp[i >> 1] + (i & 1);
        }

        return dp;
    }
}
