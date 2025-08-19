package Problem_226__Invert_Binary_Tree.Java;


public class Solution {
    public static TreeNode invertTree(TreeNode root) {
        // 如果節點為 null，直接返回 null
        if (root == null) {
            return null;
        }
        
        // 先交換左右子樹
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 將左子樹遞迴反轉以下節點（原右子樹）
        invertTree(root.left);
        // 將右子樹遞迴反轉以下節點（原左子樹）
        invertTree(root.right);

        // 返回反轉後的根節點
        return root;
    }
}
