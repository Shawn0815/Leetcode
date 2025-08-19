package Problem_572__Subtree_of_Another_Tree.Java;

public class Solution1 {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // 空子樹一定是任何樹的subtree
        if (subRoot == null) {
            return true;
        }

        // 如果subRoot非null，但root為null，那subRoot不為root的子樹
        if (root == null) {
            return false;
        }
        
        // root跟subroot相等，return true
        if (isSametree(root, subRoot)) {
            return true;
        }
        
        // 繼續往左右子樹比對
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // 檢查兩棵樹是否完全相同
    public static boolean isSametree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        
        if (root == null || subRoot == null || (root.val != subRoot.val)) {
            return false;
        }

        return isSametree(root.left, subRoot.left) && isSametree(root.right, subRoot.right);
    }
}
