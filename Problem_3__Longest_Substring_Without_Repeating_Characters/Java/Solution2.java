package Problem_3__Longest_Substring_Without_Repeating_Characters.Java;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

    public int lengthOfLongestSubstring(String s) {

        // 紀錄目前最長的 subString 長度
        int maxLen = 0;

        // 紀錄 sliding window 的左右邊界
        int left = 0, right = 0;
        
        // 用 set 紀錄目前 window 中擁有的字母
        Set<Character> set = new HashSet<>();

        // sliding window 的右邊界從零開始滑動
        for (right = 0; right < s.length(); right++) {

            // 如果字母重複，持續縮減左邊界直到 window 中字母沒有重複為止
            // 每移動一次左邊界也要同步把 set 中的字母移除！
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // 將字母放入 set 中
            set.add(s.charAt(right));

            // 更新目前最大長度（比較 sliding window 長度）
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
