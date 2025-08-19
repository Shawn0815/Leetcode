package Problem_202__Happy_Number.Java;

import java.util.Set;
import java.util.HashSet;

public class Solution1 {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>(); 

        while (n != 1) {
            // 重複出現，說明進入無限循環
            if (set.contains(n)) {
                return false;
            }
            else {
                set.add(n); // 將出現過的數字加入set
                n = sumOfSquares(n); // 更新為該數字的各位數平方和
            }
        }

        return true; // 最後平方總和為1
    }

    // 計算一個數的每位數平方總和
    public static int sumOfSquares(int x) {
        int sum = 0;

        while (x != 0) {
            sum += Math.pow((x % 10), 2);
            x /= 10;
        }

        return sum;
    }
}
