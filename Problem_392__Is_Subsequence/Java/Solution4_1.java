package Problem_392__Is_Subsequence.Java;

public class Solution4_1 {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        // 用 dp[i][j] 紀錄 s 的前 i 個字元是否為 t 的前 j 個字元的子字串
        boolean dp[][] = new boolean[sLen + 1][tLen + 1];

        // 若 s 沒有字元，必為任何子字串的子字串
        for (int j = 0; j <= tLen; j++) {
            dp[0][j] = true;
        }

        // 遍歷所有可能開始填表（從目前範圍最後一個開始比）
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= tLen; j++) {
                // 如果相等，縮小問題為，前 i-1 個跟 j-1 個的答案
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // 如果不相等，代表 t 的第 j 字元沒用（最後一個）
                // 縮小題目為 t 的前 j-1 個字元比較的結果
                else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }

        // 最後 i, j 掃完整個字串即為答案
        return dp[sLen][tLen];
    }
}
