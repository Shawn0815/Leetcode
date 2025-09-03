package Problem_347__Top_K_Frequent_Elements.Java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDemo {
    
    // Solution solution = new Solution();
    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();
    Solution3 solution = new Solution3();

    @Test
    public void topKFrequentTest_01() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        assertArrayEquals(new int[] {1, 2}, solution.topKFrequent(nums, k));
    }


    @Test
    public void topKFrequentTest_02() {
        int[] nums = {1};
        int k = 1;

        assertArrayEquals(new int[] {1}, solution.topKFrequent(nums, k));
    }
}
