package Word_Frequency;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Map<String, Integer> wordFrequency(String s) {
        String[] parts = s.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String part: parts) {
            map.put(part, map.getOrDefault(part, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s;

        // Case 1
        s = "apple cat apple dog cat apple";
        Map<String, Integer> output1 = solution.wordFrequency(s);

        for (Map.Entry<String, Integer> entry: output1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Case 2
        s = "hello world and hello";
        Map<String, Integer> output2 = solution.wordFrequency(s);

        for (Map.Entry<String, Integer> entry: output2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
