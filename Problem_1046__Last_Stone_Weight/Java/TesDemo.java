package Problem_1046__Last_Stone_Weight.Java;

public class TesDemo {
    public static void main(String[] args) {
        int[] stones1 = new int[]{2, 7, 4, 1, 8, 1};
        int[] stones2 = new int[]{1};
        int[] stones3 = new int[]{};

        System.out.println(Solution1.lastStoneWeight(stones1)); // A: 1
        System.out.println(Solution1.lastStoneWeight(stones2)); // A: 1
        System.out.println(Solution1.lastStoneWeight(stones3)); // A: 0
    }
}
