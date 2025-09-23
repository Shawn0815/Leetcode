package Problem_238__Product_of_Array_Except_Self.Java;

import java.util.Arrays;

public class Solution4_1 {
    
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        int prefixProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            result[i] *= prefixProduct;
            prefixProduct *= nums[i];
        }

        int suffixProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }

        return result;
    }
}
