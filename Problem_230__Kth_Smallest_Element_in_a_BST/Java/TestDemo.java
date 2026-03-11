package Problem_230__Kth_Smallest_Element_in_a_BST.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {

    Solution solution = new Solution();
    
    @Test
    public void kthSmallestTest_01() {

        int k = 1;

        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(2);

        root.left = node1;
        node1.right = node3;
        root.right = node2;

        int output = solution.kthSmallest(root, k);
        int expected = 1;

        assertEquals(expected, output);
    }

    @Test
    public void kthSmallestTest_02() {

        int k = 3;

        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(1);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node5;

        int output = solution.kthSmallest(root, k);
        int expected = 3;

        assertEquals(expected, output);
    }
}
