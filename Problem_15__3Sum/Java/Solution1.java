package Problem_15__3Sum.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    
    public List<List<Integer>> threeSum(int[] nums) {

        // 對陣列進行排序
        Arrays.sort(nums);

        // 將所有元素放入 map 中（key = 值；value = index）
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // 建立回傳 List
        List<List<Integer>> resultList = new ArrayList<>();

        // 固定第一個數字 i，將題目簡化為 2Sum
        for (int i = 0; i < nums.length - 1; i++) {

            // 去重（否則同樣的 nums[i] 又會找到同樣的另外兩個數字）
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // 固定第二個數字 j，去找尋剩下元素是否能使總和為零
            for (int j = i + 1; j < nums.length; j++) {

                // 去重（否則固定 i 時，同樣的 nums[j] 會找到同樣的另外一個數字）
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // target = -(nums[i] + nums[j])
                int twoSum = nums[i] + nums[j];
                int target = -1 * twoSum;

                // 如果找的到 target，且 index 不等於 i 或 j，即為答案
                if (map.containsKey(target) && map.get(target) != i && map.get(target) != j) {

                    resultList.add(List.of(nums[i], nums[j], nums[map.get(target)]));
                }                
            }
        }

        return resultList;
    }
}
