package Problem_217__Contains_Duplicate.Java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();

    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();
    // Solution3 solution = new Solution3();
    // Solution4 solution = new Solution4();

    @Test
    public void testcontainsDuplicate_01() {
        int[] nums = { 1, 2, 3, 1 };

        assertTrue(solution.containsDuplicate(nums));
    }

    @Test
    public void testcontainsDuplicate_02() {
        int[] nums = { 1, 2, 3, 4 };

        assertFalse(solution.containsDuplicate(nums));
    }

    @Test
    public void testcontainsDuplicate_03() {
        int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        assertTrue(solution.containsDuplicate(nums));
    }
}
