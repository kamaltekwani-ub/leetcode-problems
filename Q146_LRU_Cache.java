import java.util.HashMap;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/lru-cache/description/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


public class Q146_LRU_Cache
{
    class Node
    {
        int key;
        int val;
        Node previous;
        Node next;

        Node(){}

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }

        Node(int key, int val, Node previous, Node next){
            this.key = key;
            this.val = val;
            this.previous = previous;
            this.next = next;
        }
    }

    class LRUCache
    {
        Node head;
        Node tail;
        int capacity;
        Map<Integer, Node> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new HashMap<>();
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.previous = head;
        }

        public int get(int key) {
            if (!map.containsKey(key))
                return -1;

            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }

        public void put(int key, int value) {
            if (capacity == 0)
                return;

            if (map.containsKey(key)) {
                Node node = map.get(key);
                remove(node);
                node.val = value;
                insert(node);
                return;
            }

            if (map.size() == capacity) {
                map.remove(tail.previous.key);
                remove(tail.previous);
            }

            Node node = new Node(key, value);
            insert(node);
            map.put(key, node);
        }

        public void remove(Node node) {
            Node previous = node.previous;
            Node next = node.next;
            previous.next = next;
            next.previous = previous;
        }

        public void insert(Node node) {
            Node next = head.next;
            head.next = node;
            node.next = next;
            next.previous = node;
            node.previous = head;
        }
    }
}
