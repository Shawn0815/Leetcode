package Problem_139_Word_Break.Java;

import java.util.List;

public class Solution2 {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        
        // Backtracking：從 index 0 開始切
        return check(s, wordDict, 0);
    }

    // 檢查從 start 開始的 s[start .. ] 是否能被完全切割成功
    public boolean check(String s, List<String> wordDict, int start) {

        // 若走到字串尾端，代表切割成功
        if (start == s.length()) {
            return true;
        }

        // 遍歷字典中所有單字作為候選人
        for (String word: wordDict) {

            int len = word.length();

            // 如果子字串匹配字典中的單字，可作為一段切割，並嘗試下一段
            if (start + len <= s.length() && s.substring(start, start + len).equals(word)) {
                
                // 遞迴處理下一段，若其中一個 path 成功，回傳 true
                if (check(s, wordDict, start + len)) {
                    return true;
                }
            }
        }

        // 若所有 end 皆失敗，代表此 start 無法切到底，回傳 false
        return false;
    }
}
