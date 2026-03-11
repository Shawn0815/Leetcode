package Problem_104__Maximum_Depth_of_Binary_Tree.Java;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    
    public int maxDepth(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {

            level += 1;
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return level;
    }
}
