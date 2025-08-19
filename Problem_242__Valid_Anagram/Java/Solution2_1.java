package Problem_242__Valid_Anagram.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution2_1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 建立一個 map，用來記錄每個字母在兩個陣列出現的頻率差
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        // 遍歷字串 s 與 t，同步更新兩個字串的字母頻率
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        // 檢查 map 中的所有元素是否為 0
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}
