package Problem_853__Car_Fleet.Java;

import java.util.Arrays;

public class Solution2 {
    
    public int carFleet(int target, int[] position, int[] speed) {
        
        // 建立 (position, speed) 二維陣列
        int[][] pairs = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        // 對陣列的第一個元素 position 做排序
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

        // 初始化車隊數量以及前車時間
        int carFleet = 1;
        double prevTime = (target - pairs[0][0]) / pairs[0][1];

        // 依序遍歷每台車計算時間
        for (int i = 1; i < position.length; i++) {

            double time = (target - pairs[i][0]) / pairs[i][1];

            // 若時間 > 前車時間，車隊數量+1，並更新前車時間
            if (time > prevTime) {
                carFleet++;
                prevTime = time;
            }
        }

        return carFleet;
    }
}
