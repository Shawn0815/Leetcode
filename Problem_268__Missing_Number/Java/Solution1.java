package Problem_268__Missing_Number.Java;

import java.util.HashSet;

public class Solution1 {
    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // 把所有nums放進hashset
        for (int num: nums) {
            set.add(num);
        }

        // 從 0 ~ n 逐一檢查誰不在hashset裡
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1; // 不應走到這裡
    }
}
