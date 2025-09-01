package Problem_704__Binary_Search.Java;

public class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    public int binarySearch(int left, int right, int[] nums, int target) {
        int middle = (left + right) / 2;

        // 結束條件：沒找到
        if (left > right) {
            return -1;
        }

        // 搜尋 target
        if (target < nums[middle]) {
            return binarySearch(left, middle - 1, nums, target); // 改搜尋左半
        }
        else if (target > nums[middle]) {
            return binarySearch(middle + 1, right, nums, target); // 改搜尋右半
        }

        return middle; // 搜尋到目標
    }
}
