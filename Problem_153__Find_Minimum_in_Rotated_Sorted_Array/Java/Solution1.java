package Problem_153__Find_Minimum_in_Rotated_Sorted_Array.Java;

public class Solution1 {
    
    public int findMin(int[] nums) {
        
        // 初始化最小值
        int min = nums[0];

        // 依序遍歷陣列中元素
        for (int num: nums) {

            // 更新目前最小值
            min = Math.min(num, min);
        }

        return min;
    }
}
