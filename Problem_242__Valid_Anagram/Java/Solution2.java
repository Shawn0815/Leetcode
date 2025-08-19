package Problem_242__Valid_Anagram.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 建立兩個 HashMap，用來紀錄兩字串的字母出現次數
        Map<Character, Integer> count_s = new HashMap<Character, Integer>();
        Map<Character, Integer> count_t = new HashMap<Character, Integer>();

        // 遍歷字串 s 與 t，同步更新兩個字串的字母頻率
        for (int i = 0; i < s.length(); i++) {
            count_s.put(s.charAt(i), count_s.getOrDefault(s.charAt(i), 0) + 1);
            count_t.put(t.charAt(i), count_t.getOrDefault(t.charAt(i), 0) + 1);
        }

        // 比較兩個 HashMap 是否完全一致
        return count_s.equals(count_t);
    }
}
