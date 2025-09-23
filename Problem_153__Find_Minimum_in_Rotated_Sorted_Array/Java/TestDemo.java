package Problem_153__Find_Minimum_in_Rotated_Sorted_Array.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();
    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();

    @Test
    public void findMinTest_01() {
        
        int[] nums = {3, 4, 5, 1, 2};
        int expected = 1;
        int output = solution.findMin(nums);

        assertEquals(expected, output);
    }

    @Test
    public void findMinTest_02() {
        
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int expected = 0;
        int output = solution.findMin(nums);

        assertEquals(expected, output);
    }

    @Test
    public void findMinTest_03() {
        
        int[] nums = {11, 13, 15, 17};
        int expected = 11;
        int output = solution.findMin(nums);

        assertEquals(expected, output);
    }
}
