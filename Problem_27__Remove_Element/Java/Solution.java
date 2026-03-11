package Problem_27__Remove_Element.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();

        // 把 array 中不等於 val 的元素放入 list 中
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }

        int i = 0;

        // 把 list 中元素依序取出來，賦值回 nums 陣列
        for (int num: list) {
            nums[i++] = num;
        }

        // list 大小即為不等於 val 元素的數量
        return list.size();
    }
}