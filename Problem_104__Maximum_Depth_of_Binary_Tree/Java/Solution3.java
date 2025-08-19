package Problem_104__Maximum_Depth_of_Binary_Tree.Java;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public static int maxDepth(TreeNode root) {
        // 如果根節點為 null，則樹的深度為 0
        if (root == null) {
            return 0;
        }

        // 使用隊列（以linked list實作）來進行 BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // 加入根節點

        int level = 0; // 用來表示當前層級

        // 當隊列不為空時，繼續處理每一層
        while (!queue.isEmpty()) {
            // 記錄當前層級的節點數
            int level_size = queue.size();

            // 遍歷當前層的所有節點
            for (int i = 0; i < level_size; i++) {
                TreeNode node = queue.poll(); // 彈出當前節點

                // 如果有左子節點，將其加入隊列
                if(node.left != null) {
                    queue.add(node.left);
                }

                // 如果有右子節點，將其加入隊列
                if(node.right != null) {
                    queue.add(node.right);
                }
            }

            // 每遍歷完一層，深度增加 1
            level++;
        }

        return level;
    }
}
