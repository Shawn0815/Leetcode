package Problem_853__Car_Fleet.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution solution = new Solution();

    @Test
    public void carFleetTest_01() {

        int target = 12;
        int[] position = new int[] {10, 8, 0, 5, 3};
        int[] speed = new int[] {2, 4, 1, 1, 3};

        int output = solution.carFleet(target, position, speed);
        int expected = 3;

        assertEquals(expected, output);
    }

    @Test
    public void carFleetTest_02() {

        int target = 10;
        int[] position = new int[] {3};
        int[] speed = new int[] {3};

        int output = solution.carFleet(target, position, speed);
        int expected = 1;

        assertEquals(expected, output);
    }

    @Test
    public void carFleetTest_03() {

        int target = 100;
        int[] position = new int[] {0, 2, 4};
        int[] speed = new int[] {4, 2, 1};

        int output = solution.carFleet(target, position, speed);
        int expected = 1;

        assertEquals(expected, output);
    }

    @Test
    public void carFleetTest_04() {

        int target = 10;
        int[] position = new int[] {6, 8};
        int[] speed = new int[] {3, 2};

        int output = solution.carFleet(target, position, speed);
        int expected = 2;

        assertEquals(expected, output);
    }
}
