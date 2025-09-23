package Problem_153__Find_Minimum_in_Rotated_Sorted_Array.Java;

public class Solution2 {
    
    public int findMin(int[] nums) {

        // 依序跟陣列中前一個元素比較
        for (int i = 1; i < nums.length; i++) {
            
            // 如果當前元素比前一個元素小，代表他是開頭，return
            if (nums[i] < nums[i - 1]) {
                return nums[i];
            }
        }

        // 如果陣列走完，都是遞增，代表第一個元素就是最小值
        return nums[0];
    }
}