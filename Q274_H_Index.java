import java.util.Arrays;

/*
 * Problem Link : https://leetcode.com/problems/h-index/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q274_H_Index {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int index = 0;
        while (index < citations.length && citations[citations.length - index - 1] > index)
            index++;
        return index;
    }
}
