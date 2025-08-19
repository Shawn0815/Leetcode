package Problem_217__Contains_Duplicate.Java;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        // 建立一個 HashSet 記錄看過的數字
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            // 檢查數字是否存在在 Set 中
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }
}
