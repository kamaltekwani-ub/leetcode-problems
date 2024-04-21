//

/*
 * Problem Link : https://leetcode.com/problems/design-browser-history/
 * Solution Link : https://leetcode.com/problems/design-browser-history/solutions/674388/java-use-dual-linkedlist/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q1472_Design_Browser_History
{
    class BrowserHistory
    {
        public class Node{
            String url;
            Node next, prev;
            public Node(String url) {
                this.url = url;
                next = null;
                prev = null;
            }
        }

        Node curr;
        public BrowserHistory(String homepage) {
            curr = new Node(homepage);
        }

        public void visit(String url) {
            Node node = new Node(url);
            curr.next = node;
            node.prev = curr;
            curr = node;
        }

        public String back(int steps) {
            while (curr.prev != null && steps-- > 0) {
                curr = curr.prev;
            }
            return curr.url;
        }

        public String forward(int steps) {
            while (curr.next != null && steps-- > 0) {
                curr = curr.next;
            }
            return curr.url;
        }
    }
}
