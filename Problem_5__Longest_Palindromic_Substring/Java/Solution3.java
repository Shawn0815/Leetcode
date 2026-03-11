package Problem_5__Longest_Palindromic_Substring.Java;

public class Solution3 {
    
    public String longestPalindrome(String s) {
        
        int resLen = 0; // 最長回文子字串的長度
        int resIdx = 0; // 最長回文子字串的起始 index
        int n = s.length();

        // 用來記錄 s[i...j] 是否為回文
        boolean[][] dp = new boolean[n][n];

        // i 從右往左走，確保 dp[i+1][j-1] 已被計算
        for (int i = n - 1; i >= 0; i--) {

            // j 從 i 往右走，s[i...j] 從短到長逐步擴展
            for (int j = i; j < n; j++) {

                int len = j - i + 1;

                // case 1: 單一字元，一定是回文
                if (len == 1) {
                    dp[i][j] = true;
                }
                // case 2: 兩個字元，只要兩字元相等就是回文
                else if (len == 2) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                }
                // case 3: 三字元以上 → 頭尾相等 & 中間是回文
                else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
                }

                // 若子字串為回文且長度更大，更新最大長度與起始位置
                if (dp[i][j] && len > resLen) {
                    resLen = len;
                    resIdx = i;
                }
            }
        }

        // 回傳最長回文子字串
        return s.substring(resIdx, resIdx + resLen);
    }
}
