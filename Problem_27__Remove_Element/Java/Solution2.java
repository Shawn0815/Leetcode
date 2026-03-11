package Problem_27__Remove_Element.Java;

public class Solution2 {
    public int removeElement(int[] nums, int val) {
        // left 指標指向要填入值的位置
        int left = 0;

        // right 指標遍歷所有元素，一個一個找出不等於 val 的元素
        // 再把這些元素一一放入 nums[left] 中，放入後，left++
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }

        // 最後 left 的值即為不等於 val 的數量
        return left;
    }
}
