package Problem_110__Balanced_Binary_Tree.Java;

public class Solution1 {
    // 判斷整棵樹是否為平衡二元樹
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        // 左右子樹的高度
        int left = height(root.left);
        int right = height(root.right);

        // 當前節點是否平衡 & 左右子樹也要是平衡的
        boolean is_balanced = Math.abs(left - right) <= 1 && 
                                isBalanced(root.left) && 
                                isBalanced(root.right);

        return is_balanced;
    }

    // 計算樹的高度（節點數），遞迴版本
    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }
}
