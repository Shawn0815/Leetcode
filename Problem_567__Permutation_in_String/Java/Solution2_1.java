package Problem_567__Permutation_in_String.Java;

import java.util.Arrays;

public class Solution2_1 {
    public boolean checkInclusion(String s1, String s2) {
        // 如果 s1 大於 s2，s2 不可能包含 s1
        if (s1.length() > s2.length()) {
            return false;
        }
        
        int[] freq1 = new int[26];
        
        // 用 Array 紀錄 s1 每個字母出現次數
        for (char c: s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        // Loop s2 每個起點，用另一個 Array 記錄子字串的每個頻率出現次數
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] freq2 = new int[26];

            for (int j = i; j < i + s1.length(); j++) {
                freq2[s2.charAt(j) - 'a']++;
            }

            // 最後比較兩個 Array 是否相等
            if (Arrays.equals(freq1, freq2)) {
                return true;
            }
        }

        return false;
    }
}
