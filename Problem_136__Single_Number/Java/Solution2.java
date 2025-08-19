package Problem_136__Single_Number.Java;

public class Solution2 {
    public static int singleNumber(int[] nums) {
        int result = 0; // 初始值設為 0，因為任何數與 0 XOR 還是原本的數

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i]; // XOR: 相同消為0（順序無關）
        }

        return result;
    }
}
