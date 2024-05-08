import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Problem Link : https://leetcode.com/problems/course-schedule-ii/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q210_Course_Schedule_II {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacency_list = new ArrayList<>();
        int inDegree[] = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();

        for (int index = 0; index < numCourses; index++)
            adjacency_list.add(new ArrayList<>());

        for (int prerequisite[] : prerequisites) {
            inDegree[prerequisite[0]]++;
            adjacency_list.get(prerequisite[1]).add(prerequisite[0]);
        }

        for (int index = 0; index < numCourses; index++)
            if (inDegree[index] == 0)
                queue.add(index);

        int topological_sort[] = new int[numCourses];

        int index = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            topological_sort[index++] = node;

            for (int neighbour : adjacency_list.get(node)) {
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0)
                    queue.add(neighbour);
            }
        }

        return index == numCourses ? topological_sort : new int[]{};
    }
}
