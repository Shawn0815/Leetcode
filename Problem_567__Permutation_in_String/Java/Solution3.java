package Problem_567__Permutation_in_String.Java;

import java.util.Arrays;

public class Solution3 {
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

        int left = 0;
        int[] freq2 = new int[26];

        // 右指針一路擴增，增加記數，維護固定大小的 window
        for (int right = 0; right < s2.length(); right++) {
            freq2[s2.charAt(right) - 'a']++;

            // 當 window 大小跟 s1 長度相等，比較兩者的記數
            // 記數相等，回傳 true
            if ((right - left + 1) == s1.length()) {
                if (Arrays.equals(freq1, freq2)) {
                    return true;
                }

                // 比較完縮減左指針，減少記數（先減少在縮減）
                freq2[s2.charAt(left) - 'a']--;
                left++;
            }
        }

        return false;
    }
}
