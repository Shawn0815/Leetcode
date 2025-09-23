package Problem_238__Product_of_Array_Except_Self.Java;

public class Solution2_1 {
    
    public int[] productExceptSelf(int[] nums) {

        int product = 1, productWithoutZero = 1, zeroCount = 0;
        int[] result = new int[nums.length];

        // 遍歷所有數字計算乘積
        for (int num: nums) {

            // 計算所有數字乘積
            product *= num;

            // 計算零的個數
            if (num == 0) {
                zeroCount++;
                continue;
            }
            
            // 計算非零的數字乘積
            productWithoutZero *= num;
        }

        // 如果零的個數超過一個：陣列所有元素都為零
        if (zeroCount > 1) {
            return result;
        }

        // 遍歷所有數字計算結果
        for (int i = 0; i < nums.length; i++) {
            
            // 如果數字本身為零，結果為非零數字的乘積
            if (nums[i] == 0) {
                result[i] = productWithoutZero;
            }
            // 如果數字非零，結果為所有數字乘積除以自己
            else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}