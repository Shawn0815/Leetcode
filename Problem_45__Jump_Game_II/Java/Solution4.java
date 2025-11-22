package Problem_45__Jump_Game_II.Java;

public class Solution4 {
    
    public int jump(int[] nums) {

        int jumps = 0;  // 記錄跳了幾次
        int start = 0;  // 紀錄目前這一跳的起始位置
        int end = 0;    // 記錄目前這一跳的最遠邊界

        // 如果尚未跳到最後一格，就繼續嘗試跳躍
        while (end < nums.length - 1) {

            int maxReach = 0;

            // 針對這一跳可到達的範圍計算出下一跳可抵達的最遠位置
            for (int i = start; i <= end; i++) {
                maxReach = Math.max(maxReach, i + nums[i]);
            }

            jumps++;            // 跳躍
            start = end + 1;    // 更新起始位置為 end + 1
            end = maxReach;     // 更新最遠邊界為 maxReach
        }

        // 最後回傳跳了幾次
        return jumps;
    }
}
