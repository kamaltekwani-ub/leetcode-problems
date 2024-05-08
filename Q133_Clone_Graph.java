import java.util.*;

/*
 * Problem Link : https://leetcode.com/problems/clone-graph/description/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q133_Clone_Graph {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        Map<Node, Node> map = new HashMap<Node, Node>();
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(node);
        map.put(node, new Node(node.val));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (Node neighbours : current.neighbors) {
                if (!map.containsKey(neighbours)) {
                    map.put(neighbours, new Node(neighbours.val));
                    queue.add(neighbours);
                }
                map.get(current).neighbors.add(map.get(neighbours));
            }
        }
        return map.get(node);
    }

    class Node {
        int val;
        List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
