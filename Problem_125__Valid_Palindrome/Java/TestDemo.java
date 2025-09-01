package Problem_125__Valid_Palindrome.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();
    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();

    @Test
    public void isPalindromeTest_01() {
        String s = "A man, a plan, a canal: Panama";

        solution.isPalindrome(s);

        // assertEquals(true, solution.isPalindrome(s));
    }

    @Test
    public void isPalindromeTest_02() {
        String s = "race a car";

        assertEquals(false, solution.isPalindrome(s));
    }

    @Test
    public void isPalindromeTest_03() {
        String s = " ";

        assertEquals(true, solution.isPalindrome(s));
    }

}
