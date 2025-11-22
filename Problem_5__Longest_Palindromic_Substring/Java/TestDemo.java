package Problem_5__Longest_Palindromic_Substring.Java;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();

    @Test
    public void longestPalindromeTest_01() {

        String s = "babad";

        String output = solution.longestPalindrome(s);
        String expected1 = "bab";
        String expected2 = "aba";

        assertTrue(output.equals(expected1) || output.equals(expected2));
    }

    @Test
    public void longestPalindromeTest_02() {

        String s = "cbbd";

        String output = solution.longestPalindrome(s);
        String expected = "bb";

        assertTrue(output.equals(expected));
    }
}
