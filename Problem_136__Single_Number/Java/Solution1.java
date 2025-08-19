package Problem_136__Single_Number.Java;

import java.util.HashSet;

public class Solution1 {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // 如果 Set 中已經有這個數字，表示出現第二次 → 移除它
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }
            else {
                // 如果第一次出現，加入 Set
                set.add(nums[i]);
            }
        }

        // 用迭代器取得下一個元素（適用於set只有一個元素）
        return set.iterator().next();
    }
}
