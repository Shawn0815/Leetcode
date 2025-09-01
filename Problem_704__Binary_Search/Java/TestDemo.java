package Problem_704__Binary_Search.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();
    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();

    @Test
    public void searchTest_01() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;

        assertEquals(4, solution.search(nums, target));
    }

    @Test
    public void searchTest_02() {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 2;

        assertEquals(-1, solution.search(nums, target));
    }
}
