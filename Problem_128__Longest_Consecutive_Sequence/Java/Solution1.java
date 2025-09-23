package Problem_128__Longest_Consecutive_Sequence.Java;

import java.util.Arrays;

public class Solution1 {

    public int longestConsecutive(int[] nums) {

        // 如果 nums 為空陣列，直接回傳 0
        if (nums.length == 0) {
            return 0;
        }
        
        // 排序 nums 陣列
        Arrays.sort(nums);

        // 初始化連續數字個數
        int count = 1;
        int maxCount = 1;

        // 從第二個數字開始遍歷，檢查是否為連續數字
        for (int i = 1; i < nums.length; i++) {

            // 如果跟前一個數字一樣，跳過
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // 如果為連續數字，count++
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            }
            // 若非連續數字，count 重置，並判斷是否更新 maxCount
            else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        // 最後回傳最大連續數字個數（最後還要比一次）
        return Math.max(maxCount, count);
    }
}