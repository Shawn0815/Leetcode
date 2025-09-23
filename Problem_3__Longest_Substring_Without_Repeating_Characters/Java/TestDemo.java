package Problem_3__Longest_Substring_Without_Repeating_Characters.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();
    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();
    // Solution3 solution = new Solution3();

    @Test
    public void lengthOfLongestSubstringTest_01() {

        String s = "abcabcbb";

        int expected = 3;
        int output = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, output);
    }

    @Test
    public void lengthOfLongestSubstringTest_02() {

        String s = "bbbbb";

        int expected = 1;
        int output = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, output);
    }

    @Test
    public void lengthOfLongestSubstringTest_03() {

        String s = "pwwwkew";

        int expected = 3;
        int output = solution.lengthOfLongestSubstring(s);

        assertEquals(expected, output);
    }
}
