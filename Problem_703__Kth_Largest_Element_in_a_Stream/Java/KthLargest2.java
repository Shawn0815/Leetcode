package Problem_703__Kth_Largest_Element_in_a_Stream.Java;

import java.util.PriorityQueue;

public class KthLargest2 {
    private PriorityQueue<Integer> min_heap;
    private int K;

    public KthLargest2(int k, int[] nums) {
        this.min_heap = new PriorityQueue<>();
        this.K = k;

        // 把所有數字加入heap中
        for (int num: nums) {
            min_heap.offer(num);

            // 維持heap裡只有K個最大的元素，如果新增時超過，把最小的拿掉
            if (min_heap.size() > K) {
                min_heap.poll();
            }
        }
    }

    public int add(int val) {
        min_heap.offer(val);

        // 維持heap裡只有K個最大的元素，如果新增時超過，把最小的拿掉
        if (min_heap.size() > K) {
            min_heap.poll();
        }

        // 查看目前heap的頂部，也就是第K大
        return min_heap.peek();
    }
}
