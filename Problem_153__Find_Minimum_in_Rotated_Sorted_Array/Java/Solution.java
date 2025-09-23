package Problem_153__Find_Minimum_in_Rotated_Sorted_Array.Java;

public class Solution {
    
    public int findMin(int[] nums) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;

            if (nums[left] < nums[middle]) {
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }

        return nums[left];
    }
}
