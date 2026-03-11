package Problem_139_Word_Break.Java;

import java.util.List;

public class Solution4 {
    
    public boolean wordBreak(String s, List<String> wordDict) {

        // dp[i] = 從 i 開始的 substring 能否被成功切割
        boolean[] dp = new boolean[s.length() + 1];

        // Base case：空字串一定能被成功切割
        dp[s.length()] = true;

        // 從右往左填 dp
        for (int start = s.length() - 1; start >= 0; start--) {
            
            // 嘗試字典中的每個 word
            for (String word: wordDict) {

                int wordLen = word.length();

                // 若匹配成功，檢查下一段是否也成功，若是，這段也會成功
                if ((start + wordLen <= s.length()) && s.substring(start, start + wordLen).equals(word)) {
                    dp[start] = dp[start + wordLen];
                }
                
                // 一旦這段找到成功 path，不用再檢查其它 word
                if (dp[start] == true) {
                    break;
                }
            }
        }

        // 最終答案：start = 0 是否能完整切割
        return dp[0];
    }
}
