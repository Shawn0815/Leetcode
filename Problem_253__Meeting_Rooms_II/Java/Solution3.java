package Problem_253__Meeting_Rooms_II.Java;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution3 {
    
    public int minMeetingRooms(int[][] intervals) {

        // 針對起始時間排序所有區間
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int count = 0;
        int maxCount = 0;

        // 用 heap 儲存正在進行的會議的結束時間
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // 依序遍歷每個區間
        for (int[] interval: intervals) {

            // 如果 heap 中有某個區間結束時間小於此區間開始時間
            // 代表有會議結束，將它從 heap 中移除
            while (heap.size() > 0 && heap.peek() <= interval[0]) {
                heap.poll();
            }

            // 將這個區間的結束時間加入 heap
            heap.offer(interval[1]);

            // heap 大小即為同時進行中的會議數量
            count = heap.size();
            maxCount = Math.max(maxCount, count); // 取最大值
        }

        return maxCount;
    }
}
