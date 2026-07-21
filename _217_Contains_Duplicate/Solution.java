package _217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 3};
        
        Solution sol = new Solution();
        boolean output = sol.hasDuplicate(nums);

        System.out.println(output);
    }
}
