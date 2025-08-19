package Problem_572__Subtree_of_Another_Tree.Java;

public class TestDemo {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3, 
                            new TreeNode(4, new TreeNode(1), new TreeNode(2)), 
                            new TreeNode(5));
        
        TreeNode subRoot1 = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        TreeNode root2 = new TreeNode(3, 
                            new TreeNode(4, 
                            new TreeNode(1), 
                            new TreeNode(2, new TreeNode(0), null)), 
                            new TreeNode(5));
        
        TreeNode subRoot2 = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        TreeNode root3 = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        
        TreeNode subRoot3 = null;

        System.out.println("SubRoot1 is subtree of root1: " + Solution1.isSubtree(root1, subRoot1)); // A: true
        System.out.println("SubRoot2 is subtree of root2: " + Solution1.isSubtree(root2, subRoot2)); // A: false
        System.out.println("SubRoot3 is subtree of root3: " + Solution1.isSubtree(root3, subRoot3)); // A: false
    }
}
