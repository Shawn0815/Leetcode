package Problem_347__Top_K_Frequent_Elements.Java;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 1, 1, 2, 2, 3};
        int k1 = 2;

        int[] nums2 = new int[]{1};
        int k2 = 1;

        int[] nums3 = new int[]{7, 7};
        int k3 = 1;

        Solution3 solution = new Solution3();

        System.out.println(Arrays.toString(solution.topKFrequent(nums1, k1))); // A: [1, 2]
        System.out.println(Arrays.toString(solution.topKFrequent(nums2, k2))); // A: [1]
        System.out.println(Arrays.toString(solution.topKFrequent(nums3, k3))); // A: [7]
    }
}
