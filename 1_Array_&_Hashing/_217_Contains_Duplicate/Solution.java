package _217_Contains_Duplicate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
    }
}


// ============================================================
// 測試（題目的 Example），按 VS Code 的 Run 跑；上面寫演算法就好
// ============================================================

class SolutionTest {
    private final Solution sol = new Solution();

    @Test
    void example1() {
        int[] nums = new int[] {1, 2, 3, 1};
        assertEquals(true, sol.containsDuplicate(nums));
    }

    @Test
    void example2() {
        int[] nums = new int[] {1, 2, 3, 4};
        assertEquals(false, sol.containsDuplicate(nums));
    }

    @Test
    void example3() {
        int[] nums = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertEquals(true, sol.containsDuplicate(nums));
    }
}
