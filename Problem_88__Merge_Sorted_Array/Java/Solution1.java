package Problem_88__Merge_Sorted_Array.Java;

import java.util.Arrays;

public class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 把 nums2 的元素依序插入 nums1 的第 m 個元素後面
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        // 合併後再做排序
        Arrays.sort(nums1);
    }
}
