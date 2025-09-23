package Problem_238__Product_of_Array_Except_Self.Java;

public class Solution3 {

    public int[] productExceptSelf(int[] nums) {
        
        // prefix[i] 為 i 左邊數字乘積；suffix[i] 為 i 右邊數字乘積
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];

        // 初始化邊界數字結果
        prefix[0] = 1; // 第 0 個元素沒有左邊數字，設為 1
        suffix[nums.length - 1] = 1; // 最後一個元素沒有右邊數字，設為 1

        // 用 DP 概念計算 prefix 陣列
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // 用 DP 概念計算 suffix 陣列
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        // 最終結果 = 左邊乘積 * 右邊乘積
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }
}
