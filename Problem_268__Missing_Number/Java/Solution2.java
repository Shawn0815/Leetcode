package Problem_268__Missing_Number.Java;

public class Solution2 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expected_sum = (n * (n - 1)) / 2; // 數學計算：0 ~ n 總和應為多少
        int actual_sum = 0;

        for (int num: nums) {
            actual_sum += num;
        }

        return expected_sum - actual_sum; // 扣掉實際 nums[i] 總和，即為答案
    }
}
