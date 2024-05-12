import java.util.*;

/*
 * Problem Link : https://leetcode.com/problems/network-delay-time/
 * Solution Link : https://leetcode.com/problems/network-delay-time/solutions/2310813/dijkstra-s-algorithm-template-list-of-problems/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q743_Network_Delay_Time {
    public Map<Integer, Set<Node>> buildGraph(int times[][]) {
        Map<Integer, Set<Node>> map = new HashMap<>();
        for (int time[] : times) {
            map.putIfAbsent(time[0], new HashSet<>());
            map.get(time[0]).add(new Node(time[1], time[2]));
        }
        return map;
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        int time = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((a, b) -> (a.time - b.time));
        Map<Integer, Set<Node>> map = buildGraph(times);
        Set<Integer> visited = new HashSet<Integer>();

        priorityQueue.add(new Node(k, 0));

        while (!priorityQueue.isEmpty()) {
            int size = priorityQueue.size();

            while (size-- > 0) {
                Node node = priorityQueue.poll();

                if (visited.contains(node.target))
                    continue;

                time = Math.max(time, node.time);
                visited.add(node.target);

                if (visited.size() == n)
                    return time;

                if (map.containsKey(node.target)) {
                    for (Node neighbour : map.get(node.target)) {
                        int neighbourTime = neighbour.time + node.time;
                        priorityQueue.add(new Node(neighbour.target, neighbourTime));
                    }
                }


            }
        }

        return -1;
    }

    class Node {
        int target;
        int time;

        Node(int target, int time) {
            this.target = target;
            this.time = time;
        }
    }
}
