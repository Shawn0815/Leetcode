package Problem_11__Container_With_Most_Water.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();

    @Test
    public void maxAreaTest_01() {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        
        int expected = 49;
        int output = solution.maxArea(height);

        assertEquals(expected, output);
    }

    @Test
    public void maxAreaTest_02() {

        int[] height = {1, 1};
        
        int expected = 1;
        int output = solution.maxArea(height);

        assertEquals(expected, output);
    }
}
