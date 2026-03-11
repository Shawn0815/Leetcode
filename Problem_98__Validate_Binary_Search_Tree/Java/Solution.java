package Problem_98__Validate_Binary_Search_Tree.Java;

public class Solution {
    
    public boolean isValidBST(TreeNode root) {
        
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long lower, long upper) {

        if (node == null) {
            return true;
        }

        if (node.val <= lower || node.val >= upper) {
            return false;
        }

        return isValid(node.left, lower, node.val) && isValid(node.right, node.val, upper);
    }
}