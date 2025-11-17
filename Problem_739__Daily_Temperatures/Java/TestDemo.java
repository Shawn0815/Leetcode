package Problem_739__Daily_Temperatures.Java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();

    @Test
    public void dailyTemperaturesTest_01() {
        int[] temperatures = new int[] {73, 74, 75, 71, 69, 72, 76, 73};

        int[] output = solution.dailyTemperatures(temperatures);
        int[] expected = new int[] {1, 1, 4, 2, 1, 1, 0, 0};

        assertArrayEquals(expected, output);
    }

    @Test
    public void dailyTemperaturesTest_02() {
        int[] temperatures = new int[] {30, 40, 50, 60};

        int[] output = solution.dailyTemperatures(temperatures);
        int[] expected = new int[] {1, 1, 1, 0};

        assertArrayEquals(expected, output);
    }

    @Test
    public void dailyTemperaturesTest_03() {
        int[] temperatures = new int[] {30, 60, 90};

        int[] output = solution.dailyTemperatures(temperatures);
        int[] expected = new int[] {1, 1, 0};

        assertArrayEquals(expected, output);
    }
}
