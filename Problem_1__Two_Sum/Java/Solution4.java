package Problem_1__Two_Sum.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    public static int[] twoSum(int[] nums, int target) {
        // 建立 Map：儲存每個數值對應的索引
        Map<Integer, Integer> prev_map = new HashMap<>();

        // 一次迴圈就完成：查找 + 記錄
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            // 如果 map 中已經有這個補數，表示找到一組解
            if (prev_map.containsKey(diff)) {
                return new int[]{prev_map.get(diff), i};
            }
            
            // 如果沒有，就記錄目前這個數和它的 index
            prev_map.put(nums[i], i);
        }

        return new int[]{};
    }
}
