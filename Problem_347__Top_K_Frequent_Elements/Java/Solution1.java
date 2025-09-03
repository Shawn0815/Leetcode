package Problem_347__Top_K_Frequent_Elements.Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public int[] topKFrequent(int[] nums, int k) {

        // 把 array 轉成 HashMap（key=數字，value=出現次數）
        Map<Integer, Integer> frequencyMap = arrayToMapWithFreqency(nums);

        // 建立一個 list，每個元素為 map 中的 entry
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
        
        // 把 map 元素依序放入 List 中，並
        for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
            list.add(entry);
        }

        // 將 list 以 value 作為排序
        list.sort(Comparator.comparingInt((Map.Entry<Integer, Integer> a) -> a.getValue()).reversed());

        // 建立大小為 K 的回傳 array
        int[] topK = new int[k];

        // 將 heap 中的元素的數字部分放入 array 中（由於 min heap：先取出的要放入 array 尾端）
        for (int i = 0; i < k; i++) {
            topK[i] = list.get(i).getKey();
        }

        return topK;

    }

    public Map<Integer, Integer> arrayToMapWithFreqency(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map;

    }
}
