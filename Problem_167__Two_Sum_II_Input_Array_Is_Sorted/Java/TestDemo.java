package Problem_167__Two_Sum_II_Input_Array_Is_Sorted.Java;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();

    // Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();
    
    @Test
    public void twoSumTest_01() {

        int[] numbers = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] output = solution.twoSum(numbers, target);
        int[] expeted = new int[] {1, 2};

        assertArrayEquals(expeted, output);
    }

    @Test
    public void twoSumTest_02() {

        int[] numbers = new int[] {2, 3, 4};
        int target = 6;

        int[] output = solution.twoSum(numbers, target);
        int[] expeted = new int[] {1, 3};

        assertArrayEquals(expeted, output);
    }

    @Test
    public void twoSumTest_03() {

        int[] numbers = new int[] {-1, 0};
        int target = -1;

        int[] output = solution.twoSum(numbers, target);
        int[] expeted = new int[] {1, 2};

        assertArrayEquals(expeted, output);
    }
}
