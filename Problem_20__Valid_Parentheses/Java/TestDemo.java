package Problem_20__Valid_Parentheses.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();
    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();

    @Test
    public void isValidTest_01() {
        String s = "()";

        assertEquals(true, solution.isValid(s));
    }

    @Test
    public void isValidTest_02() {
        String s = "()[]{}";

        assertEquals(true, solution.isValid(s));
    }

    @Test
    public void isValidTest_03() {
        String s = "(]";

        assertEquals(false, solution.isValid(s));
    }

    @Test
    public void isValidTest_04() {
        String s = "([])";

        assertEquals(true, solution.isValid(s));
    }

    @Test
    public void isValidTest_05() {
        String s = "([)]";

        assertEquals(false, solution.isValid(s));
    }
}
