package Problem_55__Jump_Game.Java;

public class Solution4 {
    
    public boolean canJump(int[] nums) {

        // 目前位置可到達的最遠位置
        int maxReach = 0;

        // 嘗試每個起點，更新最遠距離
        for (int i = 0; i < nums.length; i++) {

            // 起點超出上個起點可達的最遠範圍，走不到這，卡住！
            if (i > maxReach) {
                return false;
            }

            // 更新可達最遠位置
            maxReach = Math.max(maxReach, i + nums[i]);

            // 若最遠位置 >= 最後一格，代表成功！
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        // 理論上走不到這，但走到這代表目前起點在最後一格，成功！
        return true;
    }
}
