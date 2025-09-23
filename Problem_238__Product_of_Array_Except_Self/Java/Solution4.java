package Problem_238__Product_of_Array_Except_Self.Java;

public class Solution4 {
    
    public int[] productExceptSelf(int[] nums) {
        
        int[] result = new int[nums.length];
        
        // 初始化 result 陣列的頭
        result[0] = 1;

        // 1. 計算 prefix 並存在 result 陣列中
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // 初始化 suffix（目前為止右邊所有數字的乘積）
        int suffixProduct = 1;

        // 2. 在 result 陣列上乘上 suffix
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= suffixProduct; // 乘上右邊所有數字
            suffixProduct *= nums[i]; // 更新右邊乘積
        }

        return result;
    }
}
