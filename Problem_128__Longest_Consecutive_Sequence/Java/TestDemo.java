package Problem_128__Longest_Consecutive_Sequence.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();

    @Test
    public void longestConsecutiveTest_01() {

        int[] nums = {100, 4, 200, 1, 3, 2};
        int expected = 4;
        int output = solution.lengthOfLongestSubstring(nums);

        assertEquals(expected, output);
    }

    @Test
    public void longestConsecutiveTest_02() {

        int[] nums = {0 ,3, 7, 2, 5, 8, 4, 6, 0, 1};
        int expected = 9;
        int output = solution.lengthOfLongestSubstring(nums);

        assertEquals(expected, output);
    }

    @Test
    public void longestConsecutiveTest_03() {

        int[] nums = {1, 0, 1, 2};
        int expected = 3;
        int output = solution.longestConsecutive(nums);

        assertEquals(expected, output);
    }
}
