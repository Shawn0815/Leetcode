package Problem_238__Product_of_Array_Except_Self.Java;

import java.util.Arrays;

public class Solution1 {
    
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        Arrays.fill(result, 1); // 把每個元素填成 1

        // 外層回圈：代表要計算 result[i] 的位置
        for (int i = 0; i < nums.length; i++) {
            
            // 內層回圈：遍歷所有元素
            for (int j = 0; j < nums.length; j++) {
                
                // 如果此元素不等於要計算的位置 i，將這個元素乘進 result[i]
                if (j != i) {
                    result[i] = result[i] * nums[j];
                }
            }
        }

        return result;
    }
}
