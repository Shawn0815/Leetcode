package Problem_3__Longest_Substring_Without_Repeating_Characters.Java;

import java.util.HashSet;
import java.util.Set;

public class Solution2_1 {

    public int lengthOfLongestSubstring(String s) {

        // 紀錄目前最長的 subString 長度
        int maxLen = 0;

        // 紀錄 sliding window 的左右邊界
        int left = 0, right = 0;
        
        // 用 set 紀錄目前 window 中擁有的字母
        Set<Character> set = new HashSet<>();

        // sliding window 的右邊界從零開始滑動
        while (right < s.length()) {

            // 如果字母不重複，放入 set 中，更新最大長度並移動右邊界
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
            // 如果字母重複，縮減左邊界，並移除 set 中字母
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}