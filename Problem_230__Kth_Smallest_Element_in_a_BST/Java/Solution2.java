package Problem_230__Kth_Smallest_Element_in_a_BST.Java;

public class Solution2 {
    
    public int kthSmallest(TreeNode root, int k) {

        // result[0] = k（倒數計數器）
        // result[1] = 最終答案
        int[] result = new int[2];
        result[0] = k;
        
        dfs(root, result);

        return result[1];
    }

    public void dfs(TreeNode node, int[] result) {

        if (node == null) {
            return;
        }

        dfs(node.left, result);
        
        // 處理當前節點，計數器 -1
        result[0]--;

        // 若計數器減為零，代表第 K 小，設定答案，結束
        if (result[0] == 0) {
            result[1] = node.val;
            return;
        }

        dfs(node.right, result);
    }
}
