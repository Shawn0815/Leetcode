package Problem_55__Jump_Game.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution3 solution = new Solution3();

    @Test
    public void canJumpTest_01() {

        int[] nums = new int[] {2, 3, 1, 1, 4};

        boolean output = solution.canJump(nums);
        boolean expected = true;

        assertEquals(expected, output);
    }

    @Test
    public void canJumpTest_02() {

        int[] nums = new int[] {3, 2, 1, 0, 4};

        boolean output = solution.canJump(nums);
        boolean expected = false;

        assertEquals(expected, output);
    }
}
