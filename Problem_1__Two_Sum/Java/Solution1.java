package 1_ Two_Sum.Java;

public class Solution1 {
    public static int[] twoSum(int[] nums, int target) {
        // 外層迴圈：從第0個元素開始
        for (int i = 0; i < nums.length; i++) {
            // 內層迴圈：從第 i+1 個開始，避免重複與自己相加
            for (int j = i + 1; j < nums.length; j++) {
                // 檢查兩數之和是否等於目標值
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}
