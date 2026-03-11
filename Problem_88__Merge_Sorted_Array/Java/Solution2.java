package Problem_88__Merge_Sorted_Array.Java;

public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 指向 nums1 跟 nums2 要比較的元素
        // 初始值：nums1 為第 m 個元素、nums2 為第 n 個元素
        int i = m - 1, j = n - 1;

        // 指向比較完的元素要填入至 nums1 的位置
        // 初始值：nums1 最後一個位置
        int last = m + n - 1;

        // 從後一路往前比，直到兩者其中一個走到頭
        while (i >= 0 && j >= 0) {
            // 如果 nums2 更大，放到 nums1 的 last 中，移動 j 指標
            if (nums2[j] > nums1[i]) {
                nums1[last] = nums2[j];
                j--;
            }
            // 如果 nums1 更大，放到 nums1 的 last 中，移動 i 指標
            else {
                nums1[last] = nums1[i];
                i--;
            }

            // last 往前移動一格，代表下一個要填入的位置
            last--;
        }

        // 若比較完畢 nums2 還有值沒填入，直接插入 nums1 的前面
        while (j >= 0) {
            nums1[last] = nums2[j];
            j--;
            last--;
        }
    }
}
