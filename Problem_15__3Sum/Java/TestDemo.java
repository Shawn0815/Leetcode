package Problem_15__3Sum.Java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestDemo {
    
    Solution solution = new Solution();

    @Test
    public void threeSumTest_01() {

        int[] nums = {-1, 0, 1, 2, -1, 4};
        List<List<Integer>> expectedList = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));

        Set<Set<Integer>> expectedSet = new HashSet<>();
        for (List<Integer> group: expectedList) {
            expectedSet.add(new HashSet<>(group));
        }

        Set<Set<Integer>> outputSet = new HashSet<>();
        for (List<Integer> group: solution.threeSum(nums)) {
            outputSet.add(new HashSet<>(group));
        }

        assertEquals(expectedSet, outputSet);
    }

    @Test
    public void threeSumTest_02() {

        int[] nums = {0, 1, 1};
        List<List<Integer>> expectedList = new ArrayList<>();

        Set<Set<Integer>> expectedSet = new HashSet<>();
        for (List<Integer> group: expectedList) {
            expectedSet.add(new HashSet<>(group));
        }

        Set<Set<Integer>> outputSet = new HashSet<>();
        for (List<Integer> group: solution.threeSum(nums)) {
            outputSet.add(new HashSet<>(group));
        }

        assertEquals(expectedSet, outputSet);
    }

    @Test
    public void threeSumTest_03() {

        int[] nums = {0, 0, 0};
        List<List<Integer>> expectedList = List.of(List.of(0, 0, 0));

        Set<Set<Integer>> expectedSet = new HashSet<>();
        for (List<Integer> group: expectedList) {
            expectedSet.add(new HashSet<>(group));
        }

        Set<Set<Integer>> outputSet = new HashSet<>();
        for (List<Integer> group: solution.threeSum(nums)) {
            outputSet.add(new HashSet<>(group));
        }

        assertEquals(expectedSet, outputSet);
    }
}
