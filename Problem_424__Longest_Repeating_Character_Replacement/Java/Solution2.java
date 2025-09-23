package Problem_424__Longest_Repeating_Character_Replacement.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    
    public int characterReplacement(String s, int k) {
        
        // 滑動窗口指針
        int left = 0, right = 0;

        // 紀錄出現頻率最高次數、總長度、以及最大長度
        int maxFreq = 0, length = 0, maxLen = 0;

        // 用 HashMap 紀錄字母及出現次數
        Map<Character, Integer> map = new HashMap<>();

        // 滑動窗口從零開始移動
        for (right = 0; right < s.length(); right++) {

            // 每看到一個字母，放入 map 中，並將出現頻率 + 1
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            // 計算窗口內頻率最高的字母的次數
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

            // 計算窗口內字母的總長度
            length = right - left + 1;

            // 若 (總長度 - 出現頻率最高次數) <= k，代表是合法字串，紀錄最大長度
            if (length - maxFreq <= k) {
                maxLen = Math.max(maxLen, length);
            }
            // 若非合法字串，移動左指針，縮減窗口，並重新判斷
            else {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
        }

        return maxLen;
    }
}
