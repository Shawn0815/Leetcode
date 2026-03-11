package Problem_56__Merge_Intervals.Java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution1 solution = new Solution1();

    @Test
    public void mergeTest_01() {

        int[][] intervals = new int[][] {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] output = solution.merge(intervals);
        int[][] expected = new int[][] {{1, 6}, {8, 10}, {15, 18}};

        assertArrayEquals(expected, output);
    }

    @Test
    public void mergeTest_02() {

        int[][] intervals = new int[][] {{1, 4}, {4, 5}};

        int[][] output = solution.merge(intervals);
        int[][] expected = new int[][] {{1, 5}};

        assertArrayEquals(expected, output);
    }

    @Test
    public void mergeTest_03() {

        int[][] intervals = new int[][] {{4, 7}, {1, 4}};

        int[][] output = solution.merge(intervals);
        int[][] expected = new int[][] {{1, 7}};

        assertArrayEquals(expected, output);
    }
}
