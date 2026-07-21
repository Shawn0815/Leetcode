package Triangle_Classification;

import java.util.Arrays;

public class Solution {
    public String triangeClassification(int[] lengths) {
        Arrays.sort(lengths);

        if (lengths[0] + lengths[1] <= lengths[2]) {
            return "Invalid";
        }
        else {
            if (lengths[0] == lengths[1] && lengths[1] == lengths[2]) {
                return "Equilateral";
            }
            else if (lengths[0] == lengths[1] || lengths[1] == lengths[2]) {
                return "Isosceles";
            }
            else {
                return "Scalene";
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] lengths;

        // Case 1
        lengths = new int[] {3, 3, 3};
        System.out.println(sol.triangeClassification(lengths));

        // Case 2
        lengths = new int[] {3, 3, 4};
        System.out.println(sol.triangeClassification(lengths));

        // Case 3
        lengths = new int[] {3, 4, 5};
        System.out.println(sol.triangeClassification(lengths));

        // Case 4
        lengths = new int[] {1, 2, 5};
        System.out.println(sol.triangeClassification(lengths));
    }
}
