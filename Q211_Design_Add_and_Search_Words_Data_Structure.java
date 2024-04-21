public class Q211_Design_Add_and_Search_Words_Data_Structure
{
    class WordDictionary
    {
        class Node
        {
            Node links[] = new Node[26];
            boolean isFound;

            public void put(char c, Node node)
            {
                links[c-'a'] = node;
            }

            public boolean contains(char c)
            {
                return links[c-'a']!=null;
            }

            public Node get(char c)
            {
                return links[c-'a'];
            }

            public boolean getisEnd()
            {
                return isFound;
            }

            public void setisEnd()
            {
                isFound = true;
            }
        }
        Node root;

        public WordDictionary() {
            root = new Node();
        }

        public void addWord(String word)
        {
            Node current = root;
            for(char c : word.toCharArray())
            {
                if(!current.contains(c))
                    current.put(c, new Node());
                current = current.get(c);
            }
            current.setisEnd();
        }

        public boolean search(String word)
        {
            Node current = root;
            return helper(root, word, 0);
        }

        public boolean helper(Node current, String word, int index)
        {
            if(index == word.length())
                return current.getisEnd();

            char c = word.charAt(index);

            if(c == '.')
            {
                for(Node children : current.links)
                {
                    if(children != null && helper(children, word, index+1))
                        return true;
                }
                return false;
            }
            else
            {
                Node children = current.get(c);

                if(children == null)
                    return false;

                return helper(children, word, index+1);
            }
        }
    }
}
