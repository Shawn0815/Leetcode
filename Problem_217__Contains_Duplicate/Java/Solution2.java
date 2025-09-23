package Problem_217__Contains_Duplicate.Java;

import java.util.Arrays;

public class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        
        // 先把陣列排序，重複的數字會排在一起
        Arrays.sort(nums);

        // 逐一比較相鄰的兩個數字是否一樣即可
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }
}
