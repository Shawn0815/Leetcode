package Problem_49__Group_Anagrams.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // 建立一個 HashMap：key 為排序後的 String，value 為對應此排序的 String List
        Map<String, List<String>> map = new HashMap<>();

        // 依序 loop 每個 String，排序並加入 Map 中
        for (String str: strs) {
            
            int[] counter = new int[26];
            char[] charArray = str.toCharArray();

            for (char c: charArray) {
                counter[c - 'a']++;
            }

            map.putIfAbsent(Arrays.toString(counter), new ArrayList<>());
            map.get(Arrays.toString(counter)).add(str);

        }

        // Java values 是 Collection，將其轉成 List 類型
        return new ArrayList<>(map.values());
    }
}
