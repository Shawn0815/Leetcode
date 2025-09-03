package Problem_49__Group_Anagrams.Java;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class TestDemo {
    
    // Solution solution = new Solution();
    Solution1 solution = new Solution1();
    // Solution2 solution = new Solution2();

    @Test
    public void groupAnagramsTest_01() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> expectedList = List.of(
            List.of("bat"), 
            List.of("nat", "tan"), 
            List.of("ate", "eat", "tea")
        );

        Set<Set<String>> expectedSet = new HashSet<>();
        for (List<String> group : expectedList) {
            expectedSet.add(new HashSet<>(group));
        }

        Set<Set<String>> outputSet = new HashSet<>();
        for (List<String> group : solution.groupAnagrams(strs)) {
            outputSet.add(new HashSet<>(group));
        }

        assertEquals(expectedSet, outputSet);
    }

    @Test
    public void groupAnagramsTest_02() {
        String[] strs = {""};

        List<List<String>> expectedList = List.of(List.of(""));

        Set<Set<String>> expectedSet = new HashSet<>();
        for (List<String> group : expectedList) {
            expectedSet.add(new HashSet<>(group));
        }

        Set<Set<String>> outputSet = new HashSet<>();
        for (List<String> group : solution.groupAnagrams(strs)) {
            outputSet.add(new HashSet<>(group));
        }

        assertEquals(expectedSet, outputSet);
    }

    @Test
    public void groupAnagramsTest_03() {
        String[] strs = {"a"};

        List<List<String>> expectedList = List.of(List.of("a"));

        Set<Set<String>> expectedSet = new HashSet<>();
        for (List<String> group : expectedList) {
            expectedSet.add(new HashSet<>(group));
        }

        Set<Set<String>> outputSet = new HashSet<>();
        for (List<String> group : solution.groupAnagrams(strs)) {
            outputSet.add(new HashSet<>(group));
        }

        assertEquals(expectedSet, outputSet);
    }
}
