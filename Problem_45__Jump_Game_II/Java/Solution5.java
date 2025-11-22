package Problem_45__Jump_Game_II.Java;

public class Solution5 {
    
    public int jump(int[] nums) {

        int jumps = 0;      // 抵達終點總步數
        int curEnd = 0;     // 這一跳的邊界
        int maxReach = 0;   // 下一跳最遠能抵達的位置

        // 邊走邊更新最遠能抵達的位置
        for (int i = 0; i < nums.length - 1; i++) {

            maxReach = Math.max(maxReach, i + nums[i]);

            // 如果走到這一跳的邊界，代表要跳一格了
            // 更新新的邊界為剛剛算出最遠能抵達的位置，並增加步數
            if (i == curEnd) {
                jumps++;
                curEnd = maxReach;
            }

            // 若這跳的邊界超過最後一格，代表完成
            if (curEnd >= nums.length - 1) {
                break;
            }
        }

        // 回傳總步數
        return jumps;
    }
}
