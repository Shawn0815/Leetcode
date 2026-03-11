package Problem_387__First_Unique_Character_in_a_String.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // 用 Map 紀錄每個字元以及它第一次出現的 index
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 若字元第一次出現，紀錄 index
            if (!map.containsKey(c)) {
                map.put(c, i);
            }
            // 若字元重複出現，將 index 設為不合法值 -1
            else {
                map.put(c, -1);
            }
        }
        
        int minIndex = Integer.MAX_VALUE;

        // 最後把 Map 中所有元素 Loop 一遍找出 idnex 合法的那些值
        // 並用 Math.min() 求出這些值的最小值
        for (int index: map.values()) {
            if (index != -1) {
                minIndex = Math.min(minIndex, index);
            }
        }

        // 若沒有找到合法 index，回傳 -1
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}