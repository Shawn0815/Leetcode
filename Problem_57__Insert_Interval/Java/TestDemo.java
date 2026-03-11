package Problem_57__Insert_Interval.Java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution1 solution = new Solution1();

    @Test
    public void insertTest_01() {

        int[][] intervals = new int[][] {{1, 3}, {6, 9}};
        int[] newInterval = new int[] {2, 5};

        int[][] output = solution.insert(intervals, newInterval);
        int[][] expected = new int[][] {{1, 5}, {6, 9}};

        assertArrayEquals(expected, output);
    }

    @Test
    public void insertTest_02() {

        int[][] intervals = new int[][] {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = new int[] {4, 8};

        int[][] output = solution.insert(intervals, newInterval);
        int[][] expected = new int[][] {{1, 2}, {3, 10}, {12, 16}};

        assertArrayEquals(expected, output);
    }
}
