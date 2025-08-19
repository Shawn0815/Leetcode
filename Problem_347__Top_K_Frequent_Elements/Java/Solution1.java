package Problem_347__Top_K_Frequent_Elements.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public int[] topKFrequent(int[] nums, int k) {
        // 建立一個Hashmap
        Map<Integer, Integer> map = new HashMap<>();

        // 儲存數字與對應出現次數
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 將Map轉為List，List每個元素為一個陣列（數字，出現次數）
        List<int[]> list = new ArrayList<>();

        // 遍歷Map中所有元素，並取出key, value
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int[] arr = new int[2];
            arr[0] = entry.getKey();
            arr[1] = entry.getValue();
            list.add(arr);
        }

        // 對list的出現次數做排序，降序
        list.sort((a, b) -> Integer.compare(b[1], a[1]));

        // 將前K個元素取出其數字
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i)[0];
        }

        return result;
    }
}
