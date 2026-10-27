package _001_Two_Sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    }
}


// ============================================================
// 測試（題目的 Example），按 VS Code 的 Run 跑；上面寫演算法就好
// ============================================================

class SolutionTest {
    private final Solution sol = new Solution();

    @Test
    void example1() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        assertEquals(anyOrder(new int[] {0, 1}), anyOrder(sol.twoSum(nums, target)));
    }

    @Test
    void example2() {
        int[] nums = new int[] {3, 2, 4};
        int target = 6;
        assertEquals(anyOrder(new int[] {1, 2}), anyOrder(sol.twoSum(nums, target)));
    }

    @Test
    void example3() {
        int[] nums = new int[] {3, 3};
        int target = 6;
        assertEquals(anyOrder(new int[] {0, 1}), anyOrder(sol.twoSum(nums, target)));
    }

    // 題目說答案順序不限：陣列、List 都轉成 List，只把最外層排序後再比
    private static Object anyOrder(Object o) {
        return sortLists(toLists(o), false);
    }

    private static Object toLists(Object o) {
        List<Object> list = new ArrayList<>();
        if (o != null && o.getClass().isArray()) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(o); i++) list.add(toLists(java.lang.reflect.Array.get(o, i)));
        } else if (o instanceof List<?> l) {
            for (Object x : l) list.add(toLists(x));
        } else {
            return o;
        }
        return list;
    }

    private static Object sortLists(Object o, boolean deep) {
        if (!(o instanceof List<?> l)) return o;
        List<Object> list = new ArrayList<>(l);
        if (deep) list.replaceAll(x -> sortLists(x, true));
        list.sort(Comparator.comparing(String::valueOf));
        return list;
    }
}
