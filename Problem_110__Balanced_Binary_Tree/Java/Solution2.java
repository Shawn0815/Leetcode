package Problem_110__Balanced_Binary_Tree.Java;

public class Solution2 {
    // 主函式：回傳 root 的平衡狀態（只取 dfs 回傳結果中的 is_balanced 欄位）
    public static boolean isBalanced(TreeNode root) {
        return dfs(root)[1] == 1; // cast: int -> boolean
    }

    // DFS 函式: return int[2]，第 0 個元素是高度，第 1 個元素是是否平衡（1 表示 true）
    public static int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 1}; // 空樹高度為 0，是平衡的
        }

        // 左/右子樹的 [高度, 是否平衡]
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        // 判斷當前節點是否平衡（本節點平衡 + 左右子樹平衡）
        boolean is_balanced = (Math.abs(left[0] - right[0]) <= 1 && 
                                left[1] == 1 && 
                                right[1] == 1);
        
        // 高度為左右子樹高度最大值 + 1（自己這一層）
        int height = 1 + Math.max(left[0], right[0]);

        return new int[]{height, is_balanced ? 1 : 0}; // cast: boolean -> int
    }
}
