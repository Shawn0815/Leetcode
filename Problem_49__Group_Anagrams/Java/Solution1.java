package Problem_49__Group_Anagrams.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for (String str: strs) {
            // 轉成字元陣列
            char[] charArray = str.toCharArray();
            // Java的sort是原地排序
            Arrays.sort(charArray);
            // 將排序後的字元陣列轉回string
            String sorted_str = new String(charArray);

            // 如果不存在這個key，加入並把value初始化為空arraylist
            group.putIfAbsent(sorted_str, new ArrayList<>());
            // 將string加入這個arraylist
            group.get(sorted_str).add(str);
        }

        // group.values()回傳的是Collection，用ArrayList<>轉成list
        return new ArrayList<>(group.values());
    }
}
