package Problem_226__Invert_Binary_Tree.Java;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        // Depth: 2
        TreeNode node_4 = new TreeNode(1, null, null);
        TreeNode node_5 = new TreeNode(3, null, null);
        TreeNode node_6 = new TreeNode(6, null, null);
        TreeNode node_7 = new TreeNode(9, null, null);

        // Depth: 1
        TreeNode node_2 = new TreeNode(2, node_4, node_5);
        TreeNode node_3 = new TreeNode(7, node_6, node_7);
        
        // Depth: 0
        TreeNode root = new TreeNode(4, node_2, node_3);

        root = Solution.invertTree(root);

        int[] output = new int[]{
            root.val,
            root.left.val,
            root.right.val,
            root.left.left.val,
            root.left.right.val,
            root.right.left.val,
            root.right.right.val
        };

        System.out.println(Arrays.toString(output));
    }
}
