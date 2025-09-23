package Problem_238__Product_of_Array_Except_Self.Java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDemo {
    Solution solution = new Solution();
    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();
    // Solution3 solution = new Solution3();
    // Solution4 solution = new Solution4();

    @Test
    public void testProductExceptSelf_01() {
        int[] nums = {1, 2, 3, 4};

        int[] output = solution.productExceptSelf(nums);
        int[] expected = new int[] {24, 12, 8, 6};

        assertArrayEquals(expected, output);
    }

    @Test
    public void testProductExceptSelf_02() {
        int[] nums = {-1, 1, 0, -3, 3};

        int[] output = solution.productExceptSelf(nums);
        int[] expected = new int[] {0, 0, 9, 0, 0};

        assertArrayEquals(expected, output);
    }
}
