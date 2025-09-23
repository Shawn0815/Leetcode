package Problem_3__Longest_Substring_Without_Repeating_Characters.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

    public int lengthOfLongestSubstring(String s) {

        // 紀錄目前最長的 subString 長度
        int maxLen = 0;

        // 紀錄 sliding window 的左右邊界
        int left = 0, right = 0;
        
        // key: 字母, value: 這個字母最後一次出現的 index
        Map<Character, Integer> map = new HashMap<>();

        // sliding window 的右邊界從零開始滑動
        for (right = 0; right < s.length(); right++) {

            // 如果 map 中已經有這個字母，且字母的最後出現的 index 在 window 中
            // 更新 window 的左邊界到重覆字母的下一個位置
            if (map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left) {
                left = map.get(s.charAt(right)) + 1;
            }

            // 將字母放入 map 中，並更新他最後一次出現的 index
            map.put(s.charAt(right), right);

            // 更新目前最大長度（比較 sliding window 長度）
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
