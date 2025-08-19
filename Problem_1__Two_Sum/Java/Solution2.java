package Problem_1__Two_Sum.Java;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public static int[] twoSum(int[] nums, int target) {
        // 將 nums 陣列轉換為二維陣列
        int[][] A = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            A[i][0] = nums[i]; // 元素0: 數值
            A[i][1] = i; // 元素1: 索引
        }

        // 根據值進行排序
        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        // 利用雙指針，最左到最右加起來檢查是否 = target
        int j = 0, k = nums.length - 1;

        while(j < k) {
            int sum = A[j][0] + A[k][0];

            if (sum == target) {
                // 回傳原本的索引：記得小的放前，大的放後!!
                return new int[]{Math.min(A[j][1], A[k][1]), 
                                 Math.max(A[j][1], A[k][1])};
            }
            else if (sum < target) {
                // 總和過小，左指針向右（讓總和變大）
                j++;
            }
            else {
                // 總和過大，右指針向左（讓總和變小）
                k--;
            }
        }

        return new int[]{};
    }
}
