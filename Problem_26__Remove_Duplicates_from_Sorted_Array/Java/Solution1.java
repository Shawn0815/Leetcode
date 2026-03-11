import java.util.TreeSet;

public class Solution1 {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        // 將陣列轉為 TreeSet
        for (int num: nums) {
            set.add(num);
        }

        int i = 0;

        // 依序取出 set 中元素，重新放回陣列中
        for (int num: set) {
            nums[i++] = num;
        }

        return set.size();
    }
}
