package Problem_98__Validate_Binary_Search_Tree.Java;

public class Solution1 {
    
    public boolean isValidBST(TreeNode root) {
        
        // 初始化整棵樹的合法範圍
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long lower, long upper) {

        // 空節點算合法BST
        if (node == null) {
            return true;
        }

        // 檢查當前節點合法範圍
        if (node.val <= lower || node.val >= upper) {
            return false;
        }

        // 往下檢查左子樹及右子樹是否合法（縮小各自上下界）
        return isValid(node.left, lower, node.val) && isValid(node.right, node.val, upper);
    }
}
