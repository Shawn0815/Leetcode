package Problem_347__Top_K_Frequent_Elements.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {
    public int[] topKFrequent(int[] nums, int k) {
        // 建立一個Hashmap
        Map<Integer, Integer> map = new HashMap<>();

        // 儲存數字與對應出現次數
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 建立freq array，共有num個數+1個元素
        List<Integer>[] freq = new List[nums.length + 1];
        for (int i = 0; i < freq.length; i ++) {
            freq[i] = new ArrayList<>(); // 初始化：值為空list
        }

        // 將map結果依序加入freq陣列中
        // index=出現次數；value=出現該次數的數字list
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            freq[entry.getValue()].add(entry.getKey()); // 將數字加入list中
        }

        int[] result = new int[k];
        int index = 0;

        // 從出現次數最大開始，若他對應到的數字list有值，加入result陣列
        for (int i = freq.length - 1; i >= 0; i--) {
            for (int num: freq[i]) {
                result[index] = num;
                index++;
            }

            // 直到陣列元素=k
            if (index == k) {
                return result;
            }
        }

        return result;
    }
}
