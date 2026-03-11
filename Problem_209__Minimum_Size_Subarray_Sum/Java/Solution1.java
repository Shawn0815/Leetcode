package Problem_209__Minimum_Size_Subarray_Sum.Java;

public class Solution1 {
    
    public int minSubArrayLen(int target, int[] nums) {
        
        // 初始化最小長度
        int minLen = Integer.MAX_VALUE;

        // 嘗試每一個起點
        for (int i = 0; i < nums.length; i++) {

            // 每個起點初始 sum 為 0
            int sum = 0;

            // 針對每一個起點，讓終點一步步往後走
            for (int j = i; j < nums.length; j++) {
                
                // 計算目前起點到終點的總合
                sum += nums[j];
                
                // 總和大於 target，這個起點找到最小 subarray 長度
                // 紀錄值，並跳出迴圈嘗試下一個起點
                if (sum >= target) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        // 最後回傳 minLen（若 minLen 維持最大值，代表沒有解）
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
