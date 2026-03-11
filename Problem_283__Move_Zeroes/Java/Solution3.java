package Problem_283__Move_Zeroes.Java;

public class Solution3 {
    public void moveZeroes(int[] nums) {
        // left 指向下一個要填非零的位置
        int left = 0;

        // right 指標掃描一次陣列，找出非零元素
        // 找到後把 left 跟 right 交換，非零放前面，零放後面
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
