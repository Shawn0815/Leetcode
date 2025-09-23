package Problem_424__Longest_Repeating_Character_Replacement.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();

    @Test
    public void characterReplacementTest_01() {

        String s = "ABAB";
        int k = 2;

        int expected = 4;
        int output = solution.characterReplacement(s, k);

        assertEquals(expected, output);
    }

    @Test
    public void characterReplacementTest_02() {

        String s = "AABABBA";
        int k = 1;

        int expected = 4;
        int output = solution.characterReplacement(s, k);

        assertEquals(expected, output);
    }

    @Test
    public void characterReplacementTest_03() {

        String s = "AABBB";
        int k = 1;

        int expected = 4;
        int output = solution.characterReplacement(s, k);

        assertEquals(expected, output);
    }
}
