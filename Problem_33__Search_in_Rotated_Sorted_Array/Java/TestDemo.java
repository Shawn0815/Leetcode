package Problem_33__Search_in_Rotated_Sorted_Array.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    // Solution solution = new Solution();
    // Solution1 solution = new Solution1();
    Solution2 solution = new Solution2();

    @Test
    public void searchTest_01() {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int expected = 4;
        int output = solution.search(nums, target);

        assertEquals(expected, output);
    }

    @Test
    public void searchTest_02() {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;

        int expected = -1;
        int output = solution.search(nums, target);

        assertEquals(expected, output);
    }

    @Test
    public void searchTest_03() {

        int[] nums = {1};
        int target = 0;

        int expected = -1;
        int output = solution.search(nums, target);

        assertEquals(expected, output);
    }

    @Test
    public void searchTest_04() {

        int[] nums = {3, 1};
        int target = 1;

        int expected = 1;
        int output = solution.search(nums, target);

        assertEquals(expected, output);
    }
}
