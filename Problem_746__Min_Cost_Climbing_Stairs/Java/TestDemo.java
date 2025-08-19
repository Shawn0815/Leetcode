package Problem_746__Min_Cost_Climbing_Stairs.Java;

public class TestDemo {
    public static void main(String[] args) {
        int[] cost1 = new int[]{10, 15, 20};
        int[] cost2 = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int[] cost3 = new int[]{1, 2, 1, 2, 1, 1, 1};

        Solution_B solution = new Solution_B();

        System.out.println("The minimum cost1 is: " + solution.minCostClimbingStairs(cost1)); // A: 15
        System.out.println("The minimum cost2 is: " + solution.minCostClimbingStairs(cost2)); // A: 6
        System.out.println("The minimum cost3 is: " + solution.minCostClimbingStairs(cost3)); // A: 4
    }
    
    
}
