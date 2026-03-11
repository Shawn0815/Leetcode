package Problem_133__Clone_Graph.Java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution2 {
    
    // 用 map 紀錄 node 與對應的 clone，作為處理過的標記
    Map<Node, Node> map = new HashMap<>();
    
    public Node cloneGraph(Node node) {    
        
        // 如果 node 是 null，直接 return null
        if (node == null)   return null;

        Queue<Node> queue = new LinkedList<>();

        // 創建 clone 並做標記（放入 map 中）
        map.put(node, new Node(node.val));

        // 放入 queue 等待處理它的鄰居
        queue.offer(node);

        // 依序遍歷 queue 中的 node 處理鄰居
        while (!queue.isEmpty()) {
            
            // 拿出 node 跟它對應的 clone
            Node ori = queue.poll();
            Node clone = map.get(ori);

            // 遍歷 node 的鄰居，也創建鄰居 clone，並做標記（放入 map）
            // 最後一樣放入 queue 等待出裡它的鄰居
            for (Node nei: ori.neighbors) {
                
                // 如果已經標記過，就不重複處理
                if (!map.containsKey(nei)) {
                    map.put(nei, new Node(nei.val));
                    queue.offer(nei);
                }

                // 鄰居 clone 完就可以加入這個 node 的 neighbors 了
                clone.neighbors.add(map.get(nei));
            }
        }

        // 最後回傳 node 的 clone
        return map.get(node);
    }
}
