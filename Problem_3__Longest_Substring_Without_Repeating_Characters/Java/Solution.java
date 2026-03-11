package Problem_3__Longest_Substring_Without_Repeating_Characters.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int maxLen = 0;
        int left = 0, right = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);

        for (int i = 1; i < s.length(); i++) {

            Character newChar = s.charAt(i);

            if (map.containsKey(newChar) && map.get(newChar) >= left) {
                left = map.get(newChar) + 1;
            }

            map.put(newChar, i);
            right++;

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}