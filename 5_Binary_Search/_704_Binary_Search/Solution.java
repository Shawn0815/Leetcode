package _704_Binary_Search;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] > target) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-1, 0, 2, 4, 6, 8};
        int target = 4;

        Solution sol = new Solution();
        int output = sol.search(nums, target);

        System.out.println(output);
    }
}
