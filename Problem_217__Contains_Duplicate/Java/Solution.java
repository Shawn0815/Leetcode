package Problem_217__Contains_Duplicate.Java;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 用 HashSet 記錄看過的數字
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // 數字是否存在在 Set 中
            if (seen.contains(num)) {
                return true; // 存在: 返回 ture
            }

            seen.add(num); // 不存在: 加到 Set 中
        }

        return false; // 檢查完還沒 return: 返回 false
    }
}
