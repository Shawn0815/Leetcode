package Problem_238__Product_of_Array_Except_Self.Java;

public class Solution3_1 {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];

        int prefixProduct = 1, suffixProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            prefix[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            suffix[i] = suffixProduct;
            suffixProduct *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
