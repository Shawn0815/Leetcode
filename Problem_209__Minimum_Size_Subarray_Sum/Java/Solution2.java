package Problem_209__Minimum_Size_Subarray_Sum.Java;

public class Solution2 {
    
    public int minSubArrayLen(int target, int[] nums) {
    
        int left = 0, right = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        // right 只會往右擴增一次（只需 loop 一遍）
        for (right = 0; right < nums.length; right++) {
            
            // 將擴增元素納入 window，計算 sum
            sum += nums[right];

            // 若總和達標，紀錄結果
            // 並持續縮減 left 直到總合右不達標
            // 接著再重複擴增 window 檢查
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        // 最後回傳 minLen（若 minLen 維持最大值，代表沒有解）
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
