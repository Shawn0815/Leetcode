package Problem_283__Move_Zeroes.Java;

public class Solution2 {
    public void moveZeroes(int[] nums) {
        // left 指向下一個要填非零的位置
        int left = 0;

        // right 指標掃描一次陣列，找出非零元素
        // 並將非零元素填入 left 位置，然後移動 left 指標到下一個
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }

        // 最後需要將非零元素後的所有元素填為零
        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}
