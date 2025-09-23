package Problem_347__Top_K_Frequent_Elements.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution2 {
    public int[] topKFrequent(int[] nums, int k) {

        // 把 array 轉成 HashMap（key=數字，value=出現次數）
        Map<Integer, Integer> frequencyMap = arrayToMapWithFreqency(nums);
        
        // 建立一個 Min heap，其中每個元素為 map 中的 entry（以 map 的 value 作為排序，升序）
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Map.Entry.comparingByValue());

        // 將 map 中的資料一一加入 heap 中
        for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
            
            minHeap.add(entry);

            // heap 維持前 K 大的元素
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // 建立大小為 K 的回傳 array
        int[] topK = new int[k];

        // 將 heap 中的元素的數字部分放入 array 中（由於 min heap：先取出的要放入 array 尾端）
        for (int i = k - 1; i >= 0; i--) {
            topK[i] = minHeap.poll().getKey();
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
