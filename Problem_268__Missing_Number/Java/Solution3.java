package Problem_268__Missing_Number.Java;

public class Solution3 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i]; // 把 (0 ~ n-1) 跟 nums[0] ~ nums[n -1] 做 XOR
        }

        xor ^= n; // 再跟 n 做 XOR: 實現所有數字 [0..n] 和所有 nums[i] 都 XOR 起來

        return xor;
    }
}
