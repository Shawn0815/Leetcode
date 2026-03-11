package Problem_230__Kth_Smallest_Element_in_a_BST.Java;

import java.util.Stack;

public class Solution {
    
    public int kthSmallest(TreeNode root, int k) {

        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {

            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            count++;

            if (count == k) {
                return curr.val;
            }

            curr = curr.right;
        }

        return -1;
    }
}
