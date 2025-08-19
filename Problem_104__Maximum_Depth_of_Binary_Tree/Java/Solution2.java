package Problem_104__Maximum_Depth_of_Binary_Tree.Java;

import java.util.Stack;

public class Solution2 {
    public static int maxDepth(TreeNode root) {
        // 空樹的深度是 0
        if (root == null) {
            return 0;
        }

        // Stack 裡放 Pair<TreeNode, Integer> 表示節點與它的深度
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1)); // 根節點深度為 1

        int max_depth = 0;

        while (!stack.isEmpty()) {
            // 拿出目前節點與其深度
            Pair current = stack.pop();
            TreeNode node = current.node;
            int depth = current.depth;

            // 更新最大深度
            max_depth = Math.max(max_depth, depth);

            // 如果有右子節點，把右子節點推進去（Stack: 先進後出 -> 先處理左）
            if (node.right != null) {
                stack.push(new Pair(node.right, depth + 1));
            }

            // 如果有左子節點，把左子節點推進去
            if (node.left != null) {
                stack.push(new Pair(node.left, depth + 1));
            }
        }

        return max_depth;
    }

    // 自訂 Pair 類別，用來存節點與它對應的深度
    private static class Pair {
        TreeNode node;
        int depth;

        public Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
}
