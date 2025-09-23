package Problem_3__Longest_Substring_Without_Repeating_Characters.Java;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

    public int lengthOfLongestSubstring(String s) {

        // 紀錄目前最長的 subString 長度
        int maxLen = 0;

        // 固定 subString 的開頭
        for (int i = 0; i < s.length(); i++) {
            
            // 用 set 紀錄目前 subString 中有的字母
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));

            // 一個個往後檢查字母是否重複
            for (int j = i + 1; j < s.length(); j++) {

                // 若字母重複，代表找到以 i 為開頭的最長 subString
                // 跳出迴圈，找下一個開頭的最長 subString
                if (set.contains(s.charAt(j))) {
                    break;
                }
                // 若字母不重複，將字母放入 set 中，再往後檢查
                else {
                    set.add(s.charAt(j));
                }
            }

            // 更新最大長度（set 的大小）
            maxLen = Math.max(maxLen, set.size());
        }

        return maxLen;
    }
}
