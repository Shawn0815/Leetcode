package Problem_133__Clone_Graph.Java;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    
    // 用 map 紀錄 node 與對應的 clone，作為處理過的標記
    Map<Node, Node> map = new HashMap<>();
    
    public Node cloneGraph(Node node) {    
        
        // 如果 node 是 null，直接 return null
        if (node == null)   return null;

        // 遞迴處理 node（clone + 標記 + 擴散處理鄰居）
        // 最後將 clone node 回傳
        return dfs(node);
    }

    private Node dfs(Node node) {

        // 若此 node 已經走訪過，不須再處理，直接回傳 clone node
        if (map.containsKey(node)) {
            return map.get(node);
        }
        
        // 處理 node：clone + 放入 map 做標記
        Node clone = new Node(node.val);
        map.put(node, clone);

        // 遍歷鄰居並遞迴擴散處理它的鄰居
        // 最後將回傳的鄰居的 clone 加入 clone node neighbors list 中
        for(Node nei: node.neighbors) {
            clone.neighbors.add(dfs(nei));
        }

        return clone;
    }
}
