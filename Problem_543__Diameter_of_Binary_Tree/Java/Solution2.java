package Problem_543__Diameter_of_Binary_Tree.Java;

public class Solution2 {
    public static int diameterOfBinaryTree(TreeNode root) {
        // 紀錄目前為止遇到的最大直徑（單位為邊數）
        int[] maxDiameter = new int[1]; // 用陣列模擬reference傳入，才可修改值
        
        dfs(root, maxDiameter);
        return maxDiameter[0];
    }

    // 計算以當前節點為根的「高度」，單位為節點數（包含自己）
    private static int dfs(TreeNode node, int[] maxDiameter) {
        if (node == null) {
            return 0;
        }

        // 左右子樹的高度（節點數，含自己）
        int left = dfs(node.left, maxDiameter);
        int right = dfs(node.right, maxDiameter);

        // 以當前節點為根的直徑 = 左子樹高度 + 右子樹高度（單位為邊數）
        // ex: 左子樹高度相當於以當前節點往左走到底經過的邊數
        int diameter = left + right;
        maxDiameter[0] = Math.max(maxDiameter[0], diameter); // 更新最大直徑

        return 1 + Math.max(left, right); // 回傳當前節點的高度給上一層
    }
}
