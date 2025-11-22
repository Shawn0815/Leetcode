package Problem_56__Merge_Intervals.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Solution2 {
    
    public int[][] merge(int[][] intervals) {
        
        // Key：事件時間，Value：增加/減少的 interval 數量
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] interval: intervals) {
            map.put(interval[0], map.getOrDefault(interval[0], 0) + 1); // 元素 0：增加 interval
            map.put(interval[1], map.getOrDefault(interval[1], 0) - 1); // 元素 1：減少 interval
        }

        int count = 0;
        List<int[]> result = new ArrayList<>();
        int[] inteval = new int[2];

        // Loop 每一個事件的時間
        for (int t: map.keySet()) {

            // count 從 0 開始，紀錄 interval 起始時間
            if (count == 0) {
                inteval[0] = t;
            }

            // 事件觸發：更新 count
            count += map.get(t);

            // count 減為 0，紀錄 interval 終止時間
            // 並將 inteval 收集至 List 當中
            if (count == 0) {
                inteval[1] = t;
                result.add(new int[] {inteval[0], inteval[1]});
            }
        }

        // 轉換 List 為 Array 寫法
        return result.toArray(new int[0][]);
    }
}
