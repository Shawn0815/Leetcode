package Problem_45__Jump_Game_II.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution1 solution = new Solution1();

    @Test
    public void jumpTest_01() {

        int[] nums = new int[] {2, 3, 1, 1, 4};

        int output = solution.jump(nums);
        int expected = 2;

        assertEquals(expected, output);
    }

    @Test
    public void jumpTest_02() {

        int[] nums = new int[] {2, 3, 0, 1, 4};

        int output = solution.jump(nums);
        int expected = 2;

        assertEquals(expected, output);
    }
}
