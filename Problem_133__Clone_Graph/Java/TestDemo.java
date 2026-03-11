package Problem_133__Clone_Graph.Java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDemo {
    
    Solution2 solution = new Solution2();

    @Test
    public void testCloneGraph_SimpleLoop() {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.neighbors.add(n2);
        n1.neighbors.add(n4);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);

        n3.neighbors.add(n2);
        n3.neighbors.add(n4);

        n4.neighbors.add(n1);
        n4.neighbors.add(n3);

        // Clone graph
        Node node = n1;
        Node cloned = solution.cloneGraph(n1);

        // 第一個節點
        Node n = node;
        Node c = cloned;
        assertEquals(n.val, c.val);

        // 第二個節點
        n = find(node, 2);
        c = find(node, 2);
        assertEquals(n.val, c.val);

        // 第三個節點
        n = find(node, 3);
        c = find(node, 3);
        assertEquals(n.val, c.val);

        // 第四個節點
        n = find(node, 4);
        c = find(node, 4);
        assertEquals(n.val, c.val);
    }

    private Node find(Node node, int targetVal) {
        
        for (Node nei : node.neighbors) {
            if (nei.val == targetVal) return nei;
        }

        return null;
    }
}
