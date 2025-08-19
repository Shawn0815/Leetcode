package Problem_100_Same_Tree.Java;

import java.util.Stack;

public class Solution2 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // 初始化堆疊，將根節點對放入堆疊中
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{p, q});

        // 當堆疊不為空時，繼續比較
        while (!stack.isEmpty()) {
            // 彈出堆疊中的節點對
            TreeNode[] node_pair = stack.pop();
            TreeNode node1 = node_pair[0];
            TreeNode node2 = node_pair[1];

            // 如果兩個節點都是 null，則跳過這一對!!
            if (node1 == null && node2 == null) {
                continue;
            }
            
            // 如果其中一個節點為 null，或者節點值不同，則返回 false
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }

             // 將左右子樹對放入堆疊中
            stack.push(new TreeNode[]{node1.left, node2.left});
            stack.push(new TreeNode[]{node1.right, node2.right});
        }

        return true;
    }
}
