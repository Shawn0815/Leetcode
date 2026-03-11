package Problem_17__Letter_Combinations_of_a_Phone_Number.Java;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();

    @Test
    public void letterCombinationsTest_01() {

        String digits = "23";

        List<String> output = solution.letterCombinations(digits);
        
        List<String> expected = new ArrayList<>();
        expected.add("ad");
        expected.add("ae");
        expected.add("af");
        expected.add("bd");
        expected.add("be");
        expected.add("bf");
        expected.add("cd");
        expected.add("ce");
        expected.add("cf");

        assertTrue(output.equals(expected));
    }

    @Test
    public void letterCombinationsTest_02() {

        String digits = "2";

        List<String> output = solution.letterCombinations(digits);
        
        List<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");

        assertTrue(output.equals(expected));
    }
}
