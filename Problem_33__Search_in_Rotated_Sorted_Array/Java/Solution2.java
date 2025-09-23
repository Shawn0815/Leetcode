package Problem_33__Search_in_Rotated_Sorted_Array.Java;

public class Solution2 {
    
    public int search(int[] nums, int target) {
        
        // 設定左右指針
        int left = 0, right = nums.length - 1;

        // 重複執行直到 left > right
        while (left <= right) {

            // 計算中間指針
            int middle = (left + right) / 2;

            // 若中間值 = target，直接回傳
            if (nums[middle] == target) {
                return middle;
            }

            // 若 nums[left] <= nums[middle]，左邊有序
            if (nums[left] <= nums[middle]) {

                // 若 target 在左邊區間內，代表他在左半邊，移動 right 指針
                if (target >= nums[left] && target < nums[middle]) {
                    right = middle - 1; 
                }
                // 反之，他在右半邊，移動 left 指針
                else {
                    left = middle + 1;
                }
            }
            // 反之，右邊有序
            else {

                // 若 target 在右邊區間內，代表他在右半邊，移動 left 指針
                if (target > nums[middle] && target <= nums[right]) {
                    left = middle + 1;
                }
                // 反之，他在左半邊，移動 left 指針
                else {
                    right = middle - 1;
                }
            }
        }

        // 若迴圈走完還沒 return，代表 target 不在陣列中，回傳 -1
        return -1;
    }
}
