package Problem_217__Contains_Duplicate.Java;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        return set.size() < nums.length;
    }
}
