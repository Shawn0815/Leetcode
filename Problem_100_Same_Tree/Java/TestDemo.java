package Problem_100_Same_Tree.Java;

public class TestDemo {
    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));

        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));

        System.out.println("p1 and q1 is same: " + Solution3.isSameTree(p1, q1)); // A: true
        System.out.println("p2 and q2 is same: " + Solution3.isSameTree(p2, q2)); // A: false
        System.out.println("p3 and q3 is same: " + Solution3.isSameTree(p3, q3)); // A: false
    }
}
