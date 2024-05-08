import java.util.ArrayList;
import java.util.HashMap;

/*
 * Problem Link : https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * Solution Link : https://leetcode.com/problems/intersection-of-two-arrays-ii/solutions/282372/java-solution-with-all-3-follow-up-questions
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q350_Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    /*
    public int[] intersect(int[] nums1, int[] nums2)
    {
        List<Integer> list = new ArrayList<>();
        List<Integer> intersectionList = new ArrayList<Integer>();
        for(int value : nums1)
            list.add(value);

        for(int value : nums2)
            if(list.contains(value))
            {
                list.remove(new Integer(value));
                intersectionList.add(value);
            }

        int result[] = new int[intersectionList.size()];
        for(int i=0 ; i<intersectionList.size() ; i++)
            result[i] = intersectionList.get(i);

        return result;
    }
    */
}
