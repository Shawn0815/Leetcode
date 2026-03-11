package Problem_417__Pacific_Atlantic_Water_Flow.Java;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestDemo {
    
    Solution1 solution = new Solution1();

    @Test
    public void pacificAtlanticTest_01() {
        
        int[][] heights = new int[][] {
            {1, 2, 2, 3, 5}, 
            {3, 2, 3, 4, 4}, 
            {2, 4, 5, 3, 1}, 
            {6, 7, 1, 4, 5}, 
            {5, 1, 1, 2, 4}
        };

        List<List<Integer>> output = solution.pacificAtlantic(heights);

        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(0, 4),
            Arrays.asList(1, 3),
            Arrays.asList(1, 4),
            Arrays.asList(2, 2),
            Arrays.asList(3, 0),
            Arrays.asList(3, 1),
            Arrays.asList(4, 0)
        );

        assertEquals(expected, output);
    }


    @Test
    public void pacificAtlanticTest_02() {
        
        int[][] heights = new int[][] {{1}};

        List<List<Integer>> output = solution.pacificAtlantic(heights);

        List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0));

        assertEquals(expected, output);
    }
}
