package Problem_543__Diameter_of_Binary_Tree.Java;

public class TestDemo {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, 
                            new TreeNode(2, 
                            new TreeNode(4), new TreeNode(5)), 
                            new TreeNode(3));
        
        TreeNode root2 = new TreeNode(1, new TreeNode(2), null);

        System.out.println("Root1's diameter is: " + Solution1.diameterOfBinaryTree(root1));
        System.out.println("Root2's diameter is: " + Solution1.diameterOfBinaryTree(root2));
    }
}
