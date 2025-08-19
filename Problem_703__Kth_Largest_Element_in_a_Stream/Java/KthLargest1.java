package Problem_703__Kth_Largest_Element_in_a_Stream.Java;

import java.util.Arrays;

public class KthLargest1 {
    int[] arr;
    int K;

    public KthLargest1(int k, int[] nums) {
        this.arr = nums; // 將初始的陣列儲存起來
        this.K = k; // 記住第 k 大
    }
    
    public int add(int val) {
        // 建立一個新陣列來新增元素（array resize）
        int[] arr_copy = new int[arr.length + 1];
        System.arraycopy(arr, 0, arr_copy, 0, arr.length);
        arr_copy[arr_copy.length - 1] = val; // 加入新值
        
        Arrays.sort(arr_copy); // 對array做排序

        arr = arr_copy; // 更新原先的array

        return arr[arr.length - K]; // 回傳第 K 大
    }
}
