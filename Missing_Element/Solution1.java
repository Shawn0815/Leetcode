package Missing_Element;

public class Solution1 {
    public int missingElement(int[] A, int[] B) {
        int result = 0;

        for (int num: A) {
            result = result ^ num;
        }

        for (int num: B) {
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
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
