/*
 * Problem Link : https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 * Solution Link :
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

public class Q2011_Final_Value_of_Variable_After_Performing_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (String operation : operations)
            value += operation.charAt(1) == '+' ? 1 : -1;

        return value;
    }
}
