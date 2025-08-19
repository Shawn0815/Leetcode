package Problem_110__Balanced_Binary_Tree.Java;

public class TestDemo {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3,
                            new TreeNode(9),
                            new TreeNode(20, 
                            new TreeNode(15), new TreeNode(7)));
        
        TreeNode root2 = new TreeNode(1,
                            new TreeNode(2, 
                            new TreeNode(3, 
                            new TreeNode(4), new TreeNode(4)), 
                            new TreeNode(3)),
                            new TreeNode(2));
        
        TreeNode root3 = null;

        System.out.println("Root1 is balanced: " + Solution2.isBalanced(root1));
        System.out.println("Root2 is balanced: " + Solution2.isBalanced(root2));
        System.out.println("Root3 is balanced: " + Solution2.isBalanced(root3));
    }
}
