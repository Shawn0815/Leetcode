package Problem_494__Target_Sum.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution5 solution = new Solution5();

    @Test
    public void findTargetSumWaysTest_01() {

        int[] nums = new int[] {1, 1, 1, 1, 1};
        int target = 3;

        int output = solution.findTargetSumWays(nums, target);
        int expected = 5;

        assertEquals(expected, output);
    }

    @Test
    public void findTargetSumWaysTest_02() {

        int[] nums = new int[] {1};
        int target = 1;

        int output = solution.findTargetSumWays(nums, target);
        int expected = 1;

        assertEquals(expected, output);
    }
}
