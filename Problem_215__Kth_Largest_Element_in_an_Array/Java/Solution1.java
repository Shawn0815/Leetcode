package Problem_215__Kth_Largest_Element_in_an_Array.Java;

import java.util.Arrays;

public class Solution1 {
    
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        return nums[nums.length - k]; // 第 k 大
    }
}
