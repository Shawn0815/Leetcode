package Problem_704__Binary_Search.Java;

public class Solution {
    
    public int search(int[] nums, int target) {

        return binarySearch(nums, target, 0, nums.length - 1);
    }


    public int binarySearch(int[] nums, int target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;
        
        if (target < nums[middle]) {
            return binarySearch(nums, target, left, middle - 1);
        }
        else if (target > nums[middle]) {
            return binarySearch(nums, target, middle + 1, right);
        }

        return middle;
    }
}
