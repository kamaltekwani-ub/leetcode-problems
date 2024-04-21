public class Q208_Implement_Trie_Prefix_Tree
{
    class Trie
    {
        class Node
        {
            Node links[] = new Node[26];
            boolean flag = false;

            public void put(char c, Node node)
            {
                links[c-'a'] = node;
            }

            public boolean contains(char c)
            {
                return links[c-'a'] != null;
            }

            public Node get(char c)
            {
                return links[c-'a'];
            }

            public void setFlag()
            {
                this.flag = true;
            }

            public boolean getFlag()
            {
                return flag;
            }
        }

        Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String word)
        {
            Node current = root;

            for(char c : word.toCharArray())
            {
                if(!current.contains(c))
                    current.put(c, new Node());

                current = current.get(c);
            }
            current.setFlag();
        }

        public boolean search(String word) {
            Node current = root;

            for(char c : word.toCharArray())
            {
                if(!current.contains(c))
                    return false;
                current = current.get(c);
            }
            return current.getFlag();
        }

        public boolean startsWith(String prefix) {
            Node current = root;

            for(char c : prefix.toCharArray())
            {
                if(!current.contains(c))
                    return false;
                current = current.get(c);
            }
            return true;
        }
    }
}
