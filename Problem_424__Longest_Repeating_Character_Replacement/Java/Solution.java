package Problem_424__Longest_Repeating_Character_Replacement.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public int characterReplacement(String s, int k) {
        
        int left = 0, right = 0;
        int maxFreq = 0, length = 0, maxLen = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (right = 0; right < s.length(); right++) {

            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));
            length = right - left + 1;

            if (length - maxFreq <= k) {
                maxLen = Math.max(maxLen, length);
            }
            else {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
        }

        return maxLen;
    }
}
