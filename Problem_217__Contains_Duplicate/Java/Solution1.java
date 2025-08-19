package Problem_217__Contains_Duplicate.Java;

public class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        // 外層迴圈，從第一個元素開始
        for (int i = 0; i < nums.length; i++) {
            // 內層迴圈，從 i+1 開始，與外層迴圈中的元素進行比對
            for (int j = i + 1; j < nums.length; j++) {
                // 如果 nums[i] 和 nums[j] 相等，表示有重複元素，返回 true
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
