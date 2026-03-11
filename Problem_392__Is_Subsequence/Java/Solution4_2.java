package Problem_392__Is_Subsequence.Java;

public class Solution4_2 {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        // 用 dp[i][j] 紀錄 s[i, ...] 是否為 t[j, ...] 的子字串
        boolean dp[][] = new boolean[sLen + 1][tLen + 1];

        // 初始化：s 為空字串，必為 t 的子字串
        for (int j = 0; j <= tLen; j++) {
            dp[sLen][j] = true;
        }

        // 從後面開始填表（前面 depend on 後面）
        // 從目前範圍的頭開始比
        for (int i = sLen - 1; i >= 0; i--) {
            for (int j = tLen - 1; j >= 0; j--) {
                // 如果 s[i] = t[j]，找到一組匹配
                // 縮小問題為 i+1 跟 j+1 的比較結果
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1];
                }
                // 如果不相等，代表 t[j] 對於匹配 s[i, ...] 是沒用的
                // 縮小問題為 i 跟 j+1 的匹配結果
                else {
                    dp[i][j] = dp[i][j + 1];
                }
            }
        }

        // 最後回傳 s[0, ...] 是否為 t[0, ...] 的子字串
        return dp[0][0];
    }
}
