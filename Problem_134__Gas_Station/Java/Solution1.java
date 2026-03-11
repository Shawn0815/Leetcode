package Problem_134__Gas_Station.Java;

public class Solution1 {
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;

        // Loop 所有可能的起點，走一圈看能否成功
        for (int start = 0; start < n; start++) {
            
            int tank = 0;           // 紀錄油箱的油量
            int pos = start;        // 紀錄目前位置
            boolean valid = true;   // 用 valid 紀錄是否成功

            // 針對每個起點，從頭走到尾檢查
            for (int step = 0; step < n; step++) {

                // 目前位置 = 起始位置 + 走的步數
                // 用 % n 來處理 wrap around 的狀況
                pos = (start + step) % n;

                // 更新油箱的油量
                tank += gas[pos] - cost[pos];

                // 如果中途某個點油量 < 0，記錄此起點為失敗
                // 並跳出迴圈，嘗試下一個起點
                if (tank < 0) {
                    valid = false;
                    break;
                }
            }

            // 如果檢查完都沒被紀錄為失敗，代表此起點為成功
            if (valid == true) {
                return start;
            }
        }

        // 如果每個起點嘗試完都無法成功，回傳 -1
        return -1;
    }
}
