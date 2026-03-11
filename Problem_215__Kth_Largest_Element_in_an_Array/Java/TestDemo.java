package Problem_215__Kth_Largest_Element_in_an_Array.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution1 solution = new Solution1();

    @Test
    public void findKthLargestTest_01() {

        int[] nums = new int[] {3, 2, 1, 5, 6, 4};
        int k = 2;

        int output = solution.findKthLargest(nums, k);
        int expected = 5;

        assertEquals(expected, output);
    }

    @Test
    public void findKthLargestTest_02() {

        int[] nums = new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 2;

        int output = solution.findKthLargest(nums, k);
        int expected = 5;

        assertEquals(expected, output);
    }
}
