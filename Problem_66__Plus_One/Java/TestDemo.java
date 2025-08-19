package Problem_66__Plus_One.Java;

public class TestDemo {
    public static void print(int[] A) {
        int size = A.length;

        System.out.print("[");

        for (int i = 0; i < size - 1; i++) {
            System.out.print(A[i]);
            System.out.print(", ");
        }

        System.out.print(A[size - 1]);
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] digits = {1, 9, 9};
        int[] output = Solution.plusOne(digits);

        print(output);
    }
}
