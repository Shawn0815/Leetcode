package Problem_104__Maximum_Depth_of_Binary_Tree.Java;

public class Solution1 {
    
    public int maxDepth(TreeNode root) {

        return dfs(root);
    }

    public int dfs(TreeNode node) {

        // Base case：若節點為空，深度為 0
        if (node == null) {
            return 0;
        }

        // 回傳 1（自己）+ 左右子樹最大深度
        return 1 + Math.max(dfs(node.left), dfs(node.right));
    }
}
