package Problem_49__Group_Anagrams.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {

        // 建立一個 HashMap：key 為排序後的 String，value 為對應此排序的 String List
        Map<String, List<String>> map = new HashMap<>();

        // 依序 loop 每個 String，排序並加入 Map 中
        for (String str: strs) {
            
            // 先轉成 charArray 再排序（Java 的 sort 是原地排序）
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);

            // 如果沒有這個 排序後的 String key，加入並把 value 初始化為空 Arraylist
            map.putIfAbsent(sortedString, new ArrayList<>());
            
            // 將 string 加入這個 Arraylist
            map.get(sortedString).add(str);
        }

        // Java values 是 Collection，將其轉成 List 類型
        return new ArrayList<>(map.values());
    }
}