package Problem_567__Permutation_in_String.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public boolean checkInclusion(String s1, String s2) {
        // 如果 s1 大於 s2，s2 不可能包含 s1
        if (s1.length() > s2.length()) {
            return false;
        }
        
        Map<Character, Integer> s1Map = new HashMap<>();

        // 用 Map 紀錄 s1 每個字母出現次數
        for (char c: s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        // Loop s2 每個起點，切出跟 s1 長度相同的子字串
        // 再用一個 Map 記錄 s2 子字串每個字母出現次數
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String s2Sub = s2.substring(i, i + s1.length());
            Map<Character, Integer> s2SubMap = new HashMap<>();

            for (char c: s2Sub.toCharArray()) {
                s2SubMap.put(c, s2SubMap.getOrDefault(c, 0) + 1);
            }

            // 最後比較兩個 Map 是否相等，相等回傳 true
            if (s1Map.equals(s2SubMap)) {
                return true;
            }
        }

        // 不相等回傳 false
        return false;
    }
}
