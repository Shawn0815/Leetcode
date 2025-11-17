package Problem_98__Validate_Binary_Search_Tree.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestDemo {
    
    Solution2 solution = new Solution2();

    @Before
    public void resetSolution() {
        solution.prev = null; // reset global variable
    }

    @Test
    public void isValidBSTTest_01() {

        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(3);

        root.left = node1;
        root.right = node2;

        boolean output = solution.isValidBST(root);
        boolean expected = true;

        assertEquals(expected, output);
    }

    @Test
    public void isValidBSTTest_02() {

        TreeNode root = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        boolean output = solution.isValidBST(root);
        boolean expected = false;

        assertEquals(expected, output);
    }
}
