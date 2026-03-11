package Problem_494__Target_Sum.Java;

public class Solution1_1 {

    // 用 global 紀錄有幾個可湊出 target 的組合
    int ways = 0;
    
    public int findTargetSumWays(int[] nums, int target) {
        
        backTrack(nums, target, 0, 0);
        return ways;
    }

    // 此函數代表目前處理 nums[i]，且總合為 curSum
    public void backTrack(int[] nums, int target, int i, int curSum) {

        // 終止條件：處理完所有數字
        if (i == nums.length) {

            // 如果能湊出 target，方法數 +1
            if (curSum == target) {
                ways += 1;
            }

            return;
        }

        // 選擇 1：對 nums[i] 加上正號，遞迴往下處理
        backTrack(nums, target, i + 1, curSum + nums[i]);

        // 選擇 2：對 nums[i] 加上負號，遞迴往下處理
        backTrack(nums, target, i + 1, curSum - nums[i]);
    }
}
