package Problem_139_Word_Break.Java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution1 {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        
        // 使用 Set 加速查詢 substring 是否在字典中
        Set<String> wordSet = new HashSet<>(wordDict);

        return check(s, wordSet, 0);
    }

    // 檢查從 start 開始的 s[start .. ] 是否能被完全切割成功
    private boolean check(String s, Set<String> wordSet, int start) {

        // 若走到字串尾端，代表切割成功
        if (start == s.length()) {
            return true;
        }

        // 針對每個 start，遍歷所有 end，嘗試所有可能的 subString
        for (int end = start; end < s.length(); end++) {

            String suString = s.substring(start, end + 1);

            // 若 subString 存在於字典，可作為一段切割，並嘗試下一段
            if (wordSet.contains(suString)) {
                
                // 遞迴處理下一段，若其中一個 path 成功，回傳 true
                if (check(s, wordSet, end + 1)) {
                    return true;
                }
            }
        }

        // 若所有 end 皆失敗，代表此 start 無法切到底，回傳 false
        return false;
    }
}
