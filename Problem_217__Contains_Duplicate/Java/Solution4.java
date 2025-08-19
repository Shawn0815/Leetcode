package Problem_217__Contains_Duplicate.Java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        // 1. Arrays.stream(nums): 轉為Java的steam，做後續操作（型態：IntStream）
        // 2. .boxed: 把IntStream每個int值轉為Integer物件，因為set只能裝物件（型態：Stream<Integer>）
        // 3. .collect(Collectors.toSet()): 把Steam裡的元素收集起來並轉為set（型態：Set<Integer>）
        // 4. 計算set的長度，並跟原始array做比較（set會去重複）
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() < nums.length;
    }
}
