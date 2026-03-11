package Problem_387__First_Unique_Character_in_a_String.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution2_1 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // 用 Map 記錄每個字元及其出現的頻率
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 從字串的頭部開始查表，找出第一個出現頻率為 1 的字元並回傳
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // 若掃描完整個字串都沒找到，回傳 -1
        return -1;
    }
}
