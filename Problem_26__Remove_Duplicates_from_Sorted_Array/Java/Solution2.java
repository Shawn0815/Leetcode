public class Solution2 {
    public int removeDuplicates(int[] nums) {
        // 左指針指向 unique 區間的右邊界
        int left = 0;

        // 右指針從非 unique 區間開始搜尋第一個非重複元素
        // 並將此元素加入 unique 區間（替換掉 unique 區間的下一個）
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
        }

        return left + 1;
    }
}