package Problem_104__Maximum_Depth_of_Binary_Tree.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();
    
    @Test
    public void maxDepthTest_01() {

        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        int output = solution.maxDepth(root);
        int expected = 3;

        assertEquals(expected, output);
    }

    @Test
    public void maxDepthTest_02() {

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);


        root.right = node1;

        int output = solution.maxDepth(root);
        int expected = 2;

        assertEquals(expected, output);
    }
}
