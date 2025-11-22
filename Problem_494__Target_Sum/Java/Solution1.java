package Problem_494__Target_Sum.Java;

public class Solution1 {
    
    public int findTargetSumWays(int[] nums, int target) {
        
        return backTrack(nums, target, 0, 0);
    }

    // 用 backTrack(i, curSum) 表示從 nums[i] 開始，且目前總合為 curSum
    // 一路走到底時，能湊出 target 的組合數
    public int backTrack(int[] nums, int target, int i, int curSum) {

        // 終止條件：處理完所有數字
        if (i == nums.length) {

            // 如果此時總合為 target，代表找到一個組合，反之為零
            return curSum == target ? 1 : 0;
        }

        // 選擇 1：對 nums[i] 加上正號，遞迴往下處理到底，有幾種組合
        int addWays = backTrack(nums, target, i + 1, curSum + nums[i]);

        // 選擇 2：對 nums[i] 加上負號，遞迴往下處理到底，有幾種組合
        int subWays = backTrack(nums, target, i + 1, curSum - nums[i]);

        // 總組合數 = 兩種選擇的組合數相加
        return addWays + subWays;
    }
}
