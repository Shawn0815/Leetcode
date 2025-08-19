package Problem_238__Product_of_Array_Except_Self.Java;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TestDemo {
    Solution solution = new Solution();

    @Test
    public void testProductExceptSelf_01() {
        int[] nums = {1, 2, 4, 6};

        int[] output = solution.productExceptSelf(nums);
        int[] expected = new int[] {48, 24, 12, 8};

        assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }

    @Test
    public void testProductExceptSelf_02() {
        int[] nums = {-1, 0, 1, 2, 3};

        int[] output = solution.productExceptSelf(nums);
        int[] expected = new int[] {0, -6, 0, 0, 0};

        assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }
}
