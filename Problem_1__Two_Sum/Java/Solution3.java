package Problem_1__Two_Sum.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        // 建立 Map：儲存每個數值對應的索引
        Map<Integer, Integer> map = new HashMap<>();

        // 先把所有數值及其索引放進 map 中
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // 再次遍歷陣列，尋找是否存在配對值
        for (int j = 0; j < nums.length; j++) {
            int diff = target - nums[j]; // 所需的配對數字

            // 檢查 map 中是否有這個數，且不是自己
            if (map.containsKey(diff) && map.get(diff) != j) {
                return new int[] { j, map.get(diff) };
            }
        }

        return new int[] {};
    }
}
