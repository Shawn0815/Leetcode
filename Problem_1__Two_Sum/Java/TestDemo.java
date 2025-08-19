package Problem_1__Two_Sum.Java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();

    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();
    // Solution3 solution = new Solution3();
    // Solution4 solution = new Solution4();

    @Test
    public void testTwoSum_01() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] output = solution.twoSum(nums, target);
        int[] expected = { 0, 1 };

        assertArrayEquals(expected, output);
    }

    @Test
    public void testTwoSum_02() {
        int[] nums = { 3, 2, 4 };
        int target = 6;

        int[] output = solution.twoSum(nums, target);
        int[] expected = { 1, 2 };

        assertArrayEquals(expected, output);
    }

    @Test
    public void testTwoSum_03() {
        int[] nums = { 3, 3 };
        int target = 6;

        int[] output = solution.twoSum(nums, target);
        int[] expected = { 0, 1 };

        assertArrayEquals(expected, output);
    }
}
