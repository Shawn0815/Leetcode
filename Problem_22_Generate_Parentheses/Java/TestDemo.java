package Problem_22_Generate_Parentheses.Java;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestDemo {
    
    Solution1 solution = new Solution1();

    @Test
    public void generateParenthesisTest_01() {

        int n = 3;
        List<String> output = solution.generateParenthesis(n);
        
        List<String> expected = new ArrayList<>();
        expected.add("((()))");
        expected.add("(()())");
        expected.add("(())()");
        expected.add("()(())");
        expected.add("()()()");

        assertTrue(output.equals(expected));
    }

    @Test
    public void generateParenthesisTest_02() {

        int n = 1;
        List<String> output = solution.generateParenthesis(n);
        
        List<String> expected = new ArrayList<>();
        expected.add("()");

        assertTrue(output.equals(expected));
    }
}
