package Problem_104__Maximum_Depth_of_Binary_Tree.Java;

public class TestDemo {
    public static void main(String[] args) {
        // Depth: 2
        TreeNode node_4 = new TreeNode(4, null, null);

        // Depth: 1
        TreeNode node_2 = new TreeNode(2, null, null);
        TreeNode node_3 = new TreeNode(3, node_4, null);
        
        // Depth: 0
        TreeNode root = new TreeNode(1, node_2, node_3);

        int max_depth = Solution1.maxDepth(root);

        System.out.println(max_depth);
    }
}
