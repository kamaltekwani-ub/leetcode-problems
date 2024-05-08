/*
 * Problem Link : https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
 * Solution Link : https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/editorial/
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q323_Number_of_Connected_Components_in_an_Undirected_Graph {
    int rank[];
    int parent[];

    private int find(int node) {
        while (node != parent[node])
            node = parent[node];
        return node;
    }

    private int union(int u, int v) {
        int parentU = find(u);
        int parentV = find(v);

        if (parentU == parentV)
            return 0;

        if (rank[parentU] > rank[parentV]) {
            parent[parentV] = parentU;
            rank[parentU] += rank[parentV];
        } else {
            parent[parentU] = parentV;
            rank[parentV] += rank[parentU];
        }
        return 1;
    }

    public int countComponents(int n, int[][] edges) {
        rank = new int[n];
        parent = new int[n];

        for (int index = 0; index < n; index++) {
            parent[index] = index;
            rank[index] = 0;
        }

        int count = n;

        for (int edge[] : edges)
            count -= union(edge[0], edge[1]);

        return count;
    }
}
