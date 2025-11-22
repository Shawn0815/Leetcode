package Problem_139_Word_Break.Java;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();

    @Test
    public void wordBreakTest_01() {

        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");

        boolean output = solution.wordBreak(s, wordDict);
        boolean expected = true;

        assertEquals(expected, output);
    }

    @Test
    public void wordBreakTest_02() {

        String s = "applepenapple";
        List<String> wordDict = List.of("apple", "pen");

        boolean output = solution.wordBreak(s, wordDict);
        boolean expected = true;

        assertEquals(expected, output);
    }

    @Test
    public void wordBreakTest_03() {

        String s = "catsandog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");

        boolean output = solution.wordBreak(s, wordDict);
        boolean expected = false;

        assertEquals(expected, output);
    }
}
