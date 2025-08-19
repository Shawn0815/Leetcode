package Problem_1__Two_Sum.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curNumber = nums[i];
            int otherNumber = target - curNumber;

            if (prevMap.containsKey(otherNumber)) {
                return new int[] { prevMap.get(otherNumber), i };
            }

            prevMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
