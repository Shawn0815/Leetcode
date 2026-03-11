package Problem_98__Validate_Binary_Search_Tree.Java;

public class Solution2 {

    // 用來記錄上一個拜訪的節點
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        
        prev = null; // 初始化
        return dfs(root);
    }

    public boolean dfs(TreeNode node) {

        // 空節點算合法BST
        if (node == null) {
            return true;
        }

        // 拜訪左節點，判斷是否為合法 BST
        if (!dfs(node.left)) {
            return false;
        }

        // 檢查當前節點是否小於上一個拜訪的節點
        if (prev != null && node.val <= prev.val) {
            return false;
        }

        // 更新上一個拜訪的節點為當前節點
        prev = node;

        // 拜訪右節點，判斷是否為合法 BST
        return dfs(node.right);
    }
}
