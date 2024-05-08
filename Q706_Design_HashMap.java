/*
 * Problem Link : https://leetcode.com/problems/design-hashmap/
 * Solution Link : https://leetcode.com/problems/design-hashmap/solutions/4130553/video-how-we-think-about-a-solution-python-javascript-java-c/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q706_Design_HashMap {
    class MyHashMap {

        Node map[];

        public MyHashMap() {
            map = new Node[1000];
            for (int index = 0; index < 1000; index++)
                map[index] = new Node(-1, -1);
        }

        public void put(int key, int value) {
            int hash = hash(key);
            Node current = map[hash];
            while (current.next != null) {
                if (current.next.key == key) {
                    current.next.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = new Node(key, value);
        }

        public int get(int key) {
            int hash = hash(key);
            Node current = map[hash].next;
            while (current != null) {
                if (current.key == key)
                    return current.value;
                current = current.next;
            }

            return -1;
        }

        public void remove(int key) {
            int hash = hash(key);
            Node current = map[hash];
            while (current.next != null) {
                if (current.next.key == key) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
        }

        private int hash(int key) {
            return key % 1000;
        }

        class Node {
            int key;
            int value;
            Node next;

            Node() {
            }

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }

            Node(int key, int value, Node next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
        }
    }
}
