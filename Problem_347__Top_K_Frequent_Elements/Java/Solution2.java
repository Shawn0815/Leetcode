package Problem_347__Top_K_Frequent_Elements.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution2 {
    public int[] topKFrequent(int[] nums, int k) {
        // 建立一個Hashmap
        Map<Integer, Integer> map = new HashMap<>();

        // 儲存數字與對應出現次數
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 建立一個heap，每個元素為一個陣列，指定以陣列第二個元素做排序（出現次數）
        PriorityQueue<int[]> min_heap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));

        // 將Map中每組資料加入heap
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            min_heap.offer(new int[]{entry.getKey(), entry.getValue()});

            // heap維持前K大的元素
            if (min_heap.size() > k) {
                min_heap.poll();
            }
        }

        // 將heap中前K個元素取出其數字
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = min_heap.poll()[0];
        }

        return result;
    }
}
