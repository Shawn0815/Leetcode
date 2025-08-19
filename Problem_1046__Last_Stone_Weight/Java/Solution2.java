package Problem_1046__Last_Stone_Weight.Java;

import java.util.PriorityQueue;

public class Solution2 {
    public static int lastStoneWeight(int[] stones) {
        // 使用 min-heap 模擬 max-heap（放入相反數）
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        
        for (int stone: stones) {
            min_heap.offer(-stone); // stone * -1 → 最大的變最小的
        }

        // 持續處理最大兩顆石頭
        while (min_heap.size() > 1) {
            int largest_1 = min_heap.poll(); // 最大的（實際上是負數）
            int largest_2 = min_heap.poll(); // 第二大的

            // 如果兩顆不一樣大，留下差值（仍為負數）
            if (largest_1 != largest_2) {
                min_heap.offer(largest_1 - largest_2);
            }
        }

        // heap是空的，所有石頭被消掉，return 0
        if (min_heap.isEmpty()) {
            return 0;
        }

        // 最後可能剩一顆石頭，取其絕對值（因為之前存的是負數）
        return Math.abs(min_heap.peek());
    }
}
