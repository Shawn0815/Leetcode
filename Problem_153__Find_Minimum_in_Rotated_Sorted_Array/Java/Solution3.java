package Problem_153__Find_Minimum_in_Rotated_Sorted_Array.Java;

public class Solution3 {
    
    public int findMin(int[] nums) {

        // 設定左右指標
        int left = 0, right = nums.length - 1;

        // 重複判斷直到 left == right
        while (left < right) {

            // 計算 middle
            int middle = (left + right) / 2;

            // 若 nums[middle] > nums[right]，最小值在右半邊，更新 left
            if (nums[middle] > nums[right]) {
                left = middle + 1;
            }
            // 否則，最小值在左半邊，更新 right
            else {
                right = middle;
            }
        }

        // 最後回傳最小值，也就是 nums[left]
        return nums[left];
    }
}
