package Problem_139_Word_Break.Java;

import java.util.List;

public class Solution3 {

    // memo[start] = 從 start 開始的字串能否被成功切割
    Boolean[] memo;
    
    public boolean wordBreak(String s, List<String> wordDict) {
        
        memo = new Boolean[s.length()];
        return check(s, wordDict, 0);
    }

    public boolean check(String s, List<String> wordDict, int start) {

        if (start == s.length()) {
            return true;
        }

        // 若已經計算過這個 start，直接回傳（避免重複計算）
        if (memo[start] != null) {
            return memo[start];
        }

        for (String word: wordDict) {

            int len = word.length();

            if (start + len <= s.length() && s.substring(start, start + len).equals(word)) {
                
                if (check(s, wordDict, start + len)) {
                    memo[start] = true; // 成功：紀錄 true
                    return true;
                }
            }
        }

        // 失敗：紀錄 false
        memo[start] = false;
        return false;
    }
}
