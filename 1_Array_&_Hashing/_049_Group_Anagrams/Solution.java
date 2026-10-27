package _049_Group_Anagrams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    }
}


// ============================================================
// 測試（題目的 Example），按 VS Code 的 Run 跑；上面寫演算法就好
// ============================================================

class SolutionTest {
    private final Solution sol = new Solution();

    @Test
    void example1() {
        String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        assertEquals(anyOrder(List.of(List.of("bat"), List.of("nat", "tan"), List.of("ate", "eat", "tea"))), anyOrder(sol.groupAnagrams(strs)));
    }

    @Test
    void example2() {
        String[] strs = new String[] {""};
        assertEquals(anyOrder(List.of(List.of(""))), anyOrder(sol.groupAnagrams(strs)));
    }

    @Test
    void example3() {
        String[] strs = new String[] {"a"};
        assertEquals(anyOrder(List.of(List.of("a"))), anyOrder(sol.groupAnagrams(strs)));
    }

    // 題目說答案順序不限：陣列、List 都轉成 List，每一層都排序後再比
    private static Object anyOrder(Object o) {
        return sortLists(toLists(o), true);
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
