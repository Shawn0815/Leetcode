package Problem_104__Maximum_Depth_of_Binary_Tree.Java;

public class Solution1 {
    public static int maxDepth(TreeNode root) {
        // Base case：若節點為空，深度為 0
        if (root == null) {
            return 0;
        }

        // 遞迴計算左/右子樹深度
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);

        // 回傳 1（自己）+ 左右子樹最大深度
        return 1 + Math.max(left_depth, right_depth);
    }
}
