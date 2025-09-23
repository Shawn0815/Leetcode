package Problem_238__Product_of_Array_Except_Self.Java;

public class Solution2 {
    
    public int[] productExceptSelf(int[] nums) {

        int product = 1, zeroCount = 0;
        int[] result = new int[nums.length];

        // 計算所有非零數的乘積以及零的個數
        for (int num: nums) {

            if (num == 0) {
                zeroCount++;
            }
            else {
                product *= num;
            }
        }

        // 如果零的個數超過一個：陣列所有元素都為零
        if (zeroCount > 1) {
            return result;
        }

        
        for (int i = 0; i < nums.length; i++) {
            
            // 如果沒有零：每個元素都是非零乘積除以數字本身
            if (zeroCount == 0) {
                result[i] = product / nums[i];
            }
            // 如果剛好一個零：只有 nums[i] == 0 的位置結果非零
            else {
                result[i] = (nums[i] == 0) ? product : 0;
            }
        }

        return result;
    }
}