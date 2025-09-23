package Problem_347__Top_K_Frequent_Elements.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {

        // 把 array 轉成 HashMap（key=數字，value=出現次數）
        Map<Integer, Integer> map = arrayToMapWithFreqency(nums);

        // 建立 freqArray：index 為出現次數，value 是對應到這個次數的所有數字 List
        List<Integer>[] freqArray = new List[nums.length + 1];

        // 初始化 List
        for (int i = 0; i < freqArray.length; i++) {
            freqArray[i] = new ArrayList<>();
        }

        // Loop map 中的元素，依序加入 freqArray
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            freqArray[entry.getValue()].add(entry.getKey());
        }

        // 建立大小為 K 的回傳 array
        int[] topK = new int[k];
        int index = 0;

        // 從 freqArray 最後一個元素開始 loop（出現次數最多的數字 list）
        for (int i = freqArray.length - 1; i >= 0; i--) {
            
            // 將 list 中的數字依序加入回傳 array
            for (int num: freqArray[i]) {
                
                topK[index] = num;
                index++;
            }

            // 如果回傳 array 大小 = k，return 結果
            if (index == k) {
                return topK;
            }
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
