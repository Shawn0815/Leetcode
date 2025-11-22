package Problem_139_Word_Break.Java;

import java.util.List;

public class Solution {
    
    public boolean wordBreak(String s, List<String> wordDict) {

        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;

        for (int start = s.length() - 1; start >= 0; start--) {
            
            for (String word: wordDict) {

                int wordLen = word.length();

                if ((start + wordLen <= s.length()) && s.substring(start, start + wordLen).equals(word)) {
                    dp[start] = dp[start + wordLen];
                }
                
                if (dp[start] == true) {
                    break;
                }
            }
        }

        return dp[0];
    }
}
