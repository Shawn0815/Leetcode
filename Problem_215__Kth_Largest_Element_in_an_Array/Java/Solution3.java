package Problem_215__Kth_Largest_Element_in_an_Array.Java;

public class Solution3 {
    
    public int findKthLargest(int[] nums, int k) {

        // 找到第 k 大的 index
        int index = nums.length - k;

        // 呼叫遞迴 quickSelect 在 0 ~ n-1 間尋找
        return quickSelect(nums, index, 0, nums.length - 1);
    }

    private int quickSelect(int[] nums, int index, int left, int right) {

        // 先做 partition 找到最終 pivot 位置
        int p = partion(nums, left, right);

        // 若目標在 pivot 左側，搜尋左邊
        if (p > index) {
            return quickSelect(nums, index, left, p - 1);
        }
        // 若目標在 pivot 右側，搜尋右邊
        else if (p < index) {
            return quickSelect(nums, index, p + 1, right);
        }
        // 若目標剛好為 pivot，找到答案
        else {
            return nums[p];
        }
    }

    // Quick sort 一樣的 partition function
    private int partion(int[] nums, int left, int right) {

        int pivot = nums[right]; // pivot 從最右開始
        int p = left; // p 為下一個放 <= pivot 的值

        for (int i = left; i < right; i++) {

            // 找到 <= pivot，放到 p 的位置（丟到左邊），移動 p
            if (nums[i] <= pivot) {
                swap(nums, p, i);
                p++;
            }
        }

        // 把 pivot 放到該放的位置
        swap(nums, p, right);
        return p;
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
