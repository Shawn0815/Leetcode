package Problem_70__Climbing_Stairs.Java;

public class TestDemo {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 3;
        int n3 = 4;

        Solution1 solution_a = new Solution1();
        Solution1 solution_b = new Solution1();
        Solution1 solution_c = new Solution1();

        System.out.println("There are " + solution_a.climbStairs(n1) + " ways to climb to the top n1."); // A: 2
        System.out.println("There are " + solution_b.climbStairs(n2) + " ways to climb to the top n2."); // A: 3
        System.out.println("There are " + solution_c.climbStairs(n3) + " ways to climb to the top n3."); // A: 5
    }
}
