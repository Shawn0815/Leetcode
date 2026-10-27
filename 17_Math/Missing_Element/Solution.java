package Missing_Element;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int missingElement(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num: B) {
            int count = map.get(num);

            if (count == 1) {
                map.remove(num);
            }
            else {
                map.put(num, count - 1);
            }
        }

        return map.keySet().iterator().next();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A;
        int[] B;

        // Case 1
        A = new int[] {3, 5, 7, 8, 9};
        B = new int[] {9, 3, 7, 8};
        System.out.println("Output: " + solution.missingElement(A, B)); // 5

        // Case 2
        A = new int[] {1, 2, 2, 3};
        B = new int[] {2, 1, 3};
        System.out.println("Output: " + solution.missingElement(A, B)); // 2

        // Case 3
        A = new int[] {4};
        B = new int[] {};
        System.out.println("Output: " + solution.missingElement(A, B)); // 4
    }
}
