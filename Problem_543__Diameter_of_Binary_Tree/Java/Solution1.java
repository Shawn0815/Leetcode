package Problem_543__Diameter_of_Binary_Tree.Java;

public class Solution1 {
    // 主函式：回傳二元樹的最大直徑（邊數）
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 左右子樹的高度
        int left = height(root.left);
        int right = height(root.right);

        // 當前節點的直徑 = 左子樹高度 + 右子樹高度
        int selfDiameter = left + right;

        // 遞迴求左右子樹各自的最大直徑
        int subDiameter = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));

        // 回傳最大直徑（取三者最大）
        return Math.max(selfDiameter, subDiameter);
    }

    // 輔助函式：計算樹的高度（節點數）
    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }
}
