import java.util.*;

public class Q212_Word_Search_II
{
    class TrieNode
    {
        TrieNode links[] = new TrieNode[26];
        String word = null;

        public boolean containsKey(char c)
        {
            return links[c-'a'] != null;
        }

        public void put(char c, TrieNode node)
        {
            links[c-'a'] = node;
        }

        public TrieNode get(char c)
        {
            return links[c-'a'];
        }

        public void setWord(String word)
        {
            this.word = word;
        }
    }

    public TrieNode buildTrie(String words[])
    {
        TrieNode root = new TrieNode();

        for(String word : words)
        {
            TrieNode current = root;
            for(char c : word.toCharArray())
            {
                if(!current.containsKey(c))
                    current.put(c, new TrieNode());
                current = current.get(c);
            }
            current.setWord(word);
        }
        return root;
    }

    public void dfs(char board[][], int m, int n, int row, int column,TrieNode current,List<String> result)
    {
        char c = board[row][column];

        if(c == '*' || current.get(c) == null)
            return;

        current = current.get(c);

        if(current.word != null)
        {
            result.add(current.word);
            current.word = null;
        }

        board[row][column] = '*';

        if(row>0)
            dfs(board, m, n, row-1, column, current, result);

        if(row<m-1)
            dfs(board, m, n, row+1, column, current, result);

        if(column>0)
            dfs(board, m, n, row, column-1, current, result);

        if(column<n-1)
            dfs(board, m, n, row, column+1, current, result);

        board[row][column] = c;
    }

    public List<String> findWords(char[][] board, String[] words)
    {
        TrieNode root = buildTrie(words);

        List<String> result = new ArrayList<String>();

        int m = board.length;
        int n = board[0].length;

        for(int i=0 ; i<m ; i++)
            for(int j=0 ; j<n ; j++)
                dfs(board, m, n, i, j, root, result);

        return result;
    }
}
