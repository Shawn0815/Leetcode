package Problem_704__Binary_Search.Java;

public class Solution2 {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        // 當搜尋區間還有效（left <= right）就持續搜尋
        while (left <= right) {
            int middle = (left + right) / 2;

            // 中間比target小，將目標轉移到左半邊
            if (nums[middle] > target) {
                right = middle - 1;
            }
            // 中間比target大，將目標轉移到右半邊
            else if (nums[middle] < target) {
                left = middle + 1;
            }
            // 找到目標，回傳索引
            else {
                return middle;
            }
        }

        // 找不到目標，回傳 -1
        return -1;
    }
}
