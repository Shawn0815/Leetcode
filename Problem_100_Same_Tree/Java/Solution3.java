package Problem_100_Same_Tree.Java;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // 初始化隊列，將根節點對放入隊列中
        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.add(new TreeNode[]{p, q});

        // 當隊列不為空時，繼續比較
        while (!queue.isEmpty()) {
            // 彈出隊列中的節點對
            TreeNode[] node_pair = queue.poll();
            TreeNode node1 = node_pair[0];
            TreeNode node2 = node_pair[1];

            // 如果兩個節點都是 null，則跳過這一對（代表這一對相等）
            if (node1 == null && node2 == null) {
                continue;
            }
            
            // 如果其中一個節點為 null，或者節點值不同，則返回 false
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }

            // 將左右子樹對放入隊列中
            queue.add(new TreeNode[]{node1.left, node2.left});
            queue.add(new TreeNode[]{node1.right, node2.right});
        }

        // 如果所有比較都相同，則返回 true
        return true;
    }
}
