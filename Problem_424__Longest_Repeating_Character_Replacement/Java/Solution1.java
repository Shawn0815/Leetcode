package Problem_424__Longest_Repeating_Character_Replacement.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    
    public int characterReplacement(String s, int k) {
        
        // 紀錄最大長度
        int maxLen = 0;

        // 固定字串的開頭
        for (int i = 0; i < s.length(); i++) {

            // 用 HashMap 紀錄字母及出現次數（設定第一個字母的初始次數為 1）
            Map<Character, Integer> map = new HashMap<>();
            map.put(s.charAt(i), 1);
            
            // 紀錄出現頻率最高次數、字串總長度
            int maxFreq = 1, length = 0;

            // 從 i + 1 的位置依序遍歷所有可能字串
            for (int j = i + 1; j < s.length(); j++) {

                // 針對每一個字母，放入 map 中，並記錄出現頻率
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

                // 計算目前字串出現頻率次數最高的次數
                maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));

                // 計算字串總長度
                length = j - i + 1;

                // 若 (總長度 - 出現頻率最高次數) <= k，代表是合法字串，紀錄最大長度
                if (length - maxFreq <= k) {
                    maxLen = Math.max(maxLen, length);
                }
            }
        }

        return maxLen;
    }
}