package Problem_33__Search_in_Rotated_Sorted_Array.Java;

public class Solution1 {
    
    public int search(int[] nums, int target) {
        
        // 依序遍歷陣列中每個元素
        for (int i = 0; i < nums.length; i++) {
            
            // 若 元素等於 target，回傳 index
            if (nums[i] == target) {
                return i;
            }
        }

        // 所有元素都不等於 target，回傳 -1
        return -1;
    }
}
