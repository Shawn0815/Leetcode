package Problem_704__Binary_Search.Java;

public class Solution1 {
    // 遞迴搜尋：初始搜尋區間是 0 到 nums.length - 1
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }

    // 搜尋區間縮限在left ~ right中間尋找
    public static int binarySearch(int left, int right, int[] nums, int target) {
        int middle = (left + right) / 2;

        // 搜尋區間無效，代表沒找到目標
        if (left > right) {
            return -1;
        }

        // 中間比target小，將目標轉移到左半標重新搜尋
        if (nums[middle] > target) {
            return binarySearch(left, middle - 1, nums, target);
        }
        // 中間比target大，將目標轉移到右半標重新搜尋
        else if (nums[middle] < target) {
            return binarySearch(middle + 1, right, nums, target);
        }

        // 找到目標，回傳索引
        return middle;
    }
}
