package Problem_49__Group_Anagrams.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 建立一個map來放counter跟他對應到的string list
        Map<String, List<String>> group = new HashMap<>();

        // 依序loop每個string計算其counter
        for (String str: strs) {
            int[] counter = new int[26];

            for (char c: str.toCharArray()) {
                counter[c - 'a']++;
            }

            // 如果不存在counter這個key，加入並把value初始化為空arraylist
            // 直接put會把原先key對應到的value給覆蓋
            group.putIfAbsent(Arrays.toString(counter), new ArrayList<>());

            // 將string加入這個空的arraylist
            group.get(Arrays.toString(counter)).add(str);
        }

        // group.values()回傳的是Collection，用ArrayList<>轉成list
        return new ArrayList<>(group.values());
    }
}
