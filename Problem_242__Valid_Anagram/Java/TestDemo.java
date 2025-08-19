package Problem_242__Valid_Anagram.Java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDemo {
    Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();
    // Solution2_1 solution = new Solution2_1();
    // Solution3 solution = new Solution3();

    @Test
    public void testIsAnagram_01() {
        String s = "anagram";
        String t = "nagaram";

        assertTrue(solution.isAnagram(s, t));
    }

    @Test
    public void testIsAnagram_02() {
        String s = "rat";
        String t = "car";

        assertFalse(solution.isAnagram(s, t));
    }
}
