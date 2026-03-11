package Problem_134__Gas_Station.Java;

public class Solution2 {
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        int tank = 0;   // 紀錄油箱的總油量
        int total = 0;  // 記錄所有站的 gas - cost 總和
        int start = 0;  // 紀錄起始位置
        
        for (int i = 0; i < n; i++) {

            // 記錄此站的 gas - cost
            int diff = gas[i] - cost[i];

            total += diff;  // 更新所有站的 gas - cost 總和
            tank += diff;   // 更新油箱量

            // 如果這站使得油箱量 < 0，代表這站以及前面所有站都不可能為起點
            // 更新起點為這站的下一站，並將油箱歸零
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        // 如果最後所有站的 gas - cost 總合 < 0
        // 代表不可能繞完一圈，回傳 - 1
        // 反之可以完成，回傳紀錄的起點
        return (total < 0) ? -1 : start;
    }
}
