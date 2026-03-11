package Problem_55__Jump_Game.Java;

public class Solution5 {
    
    public boolean canJump(int[] nums) {

        int n = nums.length;
        
        // 一開始的目標是走到最後一格
        int goal = n - 1;

        // 從倒數第二格右往左走
        for (int i = n - 2; i >= 0; i--) {

            // 若其中某格可以走到目標位置，更新目標位置為那一格
            // 縮小子問題
            if (i + nums[i] > goal) {
                goal = i;
            }
        }

        // 若最後目標是走到第一格，代表一定能走到最後一格
        return goal == 0;
    }
}