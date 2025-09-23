package Problem_15__3Sum.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
    
    public List<List<Integer>> threeSum(int[] nums) {

        // 對陣列進行排序
        Arrays.sort(nums);

        // 建立回傳 List
        List<List<Integer>> resultList = new ArrayList<>();

        // 固定第一個數字 i，將題目簡化為 2Sum
        for (int i = 0; i < nums.length - 1; i++) {

            // 去重（否則同樣的 nums[i] 又會找到同樣的另外兩個數字）
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1, right = nums.length - 1;

            // 依序移動左右指針，檢查總和是否太大或太小
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // 總和太小，左指針向右移動
                if (sum < 0) {
                    left++;
                }
                // 總和太大，右指針向左移動
                else if (sum > 0) {
                    right--;
                }
                // 總和剛好為零，加入 list
                else {
                    resultList.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // nums[left] 重複，跳過，直到不重複
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // nums[right] 重複，跳過，直到不重複
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return resultList;
    }
}
