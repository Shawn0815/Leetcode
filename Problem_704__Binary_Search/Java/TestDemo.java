package Problem_704__Binary_Search.Java;

public class TestDemo {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;

        // int[] nums = new int[]{-1,0,3,5,9,12};
        // int target = 2;

        // int[] nums = new int[]{-1,0,2,4,6,8};
        // int target = 4;

        System.out.println(Solution2.search(nums, target));
    }
}
