package Problem_283__Move_Zeroes.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();

        // 將陣列中非零元素加入 list 中
        for (int num: nums) {
            if (num != 0) {
                list.add(num);
            }
        }

        // 將 list 中元素依序取出放回 nums 陣列
        // 最後把非零元素外的其他元素覆蓋為 0
        for (int i = 0; i < nums.length; i++) {
            if (i <= list.size() - 1) {
                nums[i] = list.get(i);
            }
            else {
                nums[i] = 0;
            }
        }
    }
}