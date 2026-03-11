package Problem_494__Target_Sum.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution4 {
    
    public int findTargetSumWays(int[] nums, int target) {
        
        int n = nums.length;

        // 當前這層的 dp HashMap
        Map<Integer, Integer> dp = new HashMap<>();

        dp.put(0, 1);

        for (int i = 1; i <= n; i++) {

            // 下一層的 dp HashMap
            Map<Integer, Integer> nextDp = new HashMap<>();
            
            for (Map.Entry<Integer, Integer> entry: dp.entrySet()) {

                int prevSum = entry.getKey();
                int prevWays = entry.getValue();

                // 下一層只取決於上一層
                nextDp.put(prevSum + nums[i - 1], nextDp.getOrDefault(prevSum + nums[i - 1], 0) + prevWays);
                nextDp.put(prevSum - nums[i - 1], nextDp.getOrDefault(prevSum - nums[i - 1], 0) + prevWays);
            }

            // 更新下一層為當前層
            dp = nextDp;
        }

        return dp.getOrDefault(target, 0);
    }
}
