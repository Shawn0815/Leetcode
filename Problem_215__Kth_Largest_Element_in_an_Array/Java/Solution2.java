package Problem_215__Kth_Largest_Element_in_an_Array.Java;

import java.util.PriorityQueue;

public class Solution2 {
    
    public int findKthLargest(int[] nums, int k) {

        // 維護一個 heap 存放 k 個最大的元素
        PriorityQueue<Integer> minHheap = new PriorityQueue<>();

        for (int num: nums) {

            // 依序將元素放入 heap 中
            minHheap.offer(num);

            // 若 heap 個數 > k，移除最小的那個
            if (minHheap.size() > k) {
                minHheap.poll();
            }
        }

        // 最後回傳 heap 的頂部元素，即為第 k 大元素
        return minHheap.peek();
    }
}
