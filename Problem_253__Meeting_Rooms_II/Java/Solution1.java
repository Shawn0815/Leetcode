package Problem_253__Meeting_Rooms_II.Java;

import java.util.TreeMap;

public class Solution1 {
    
    public int minMeetingRooms(int[][] intervals) {
        
        // 用 TreeMap 紀錄每個事件時間以及代表的新增/減少會議數量
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // 遍歷所有區間，將每個時間點加入 map 中
        for (int[] interval: intervals) {
            map.put(interval[0], map.getOrDefault(interval[0], 0) + 1);
            map.put(interval[1], map.getOrDefault(interval[1], 0) - 1);
        }

        int count = 0;
        int maxCount = 0;

        // 遍歷所有事件的時間點，計算目前同時的會議數量
        for (int t: map.keySet()) {
            count += map.get(t);
            maxCount = Math.max(maxCount, count); // 取最大值
        }

        return maxCount;
    }
}
