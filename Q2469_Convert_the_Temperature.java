/*
 * Problem Link : https://leetcode.com/problems/convert-the-temperature/
 * Solution Link :
 *
 * Time Complexity : O(1)
 * Space Complexity : O(1)
 */

public class Q2469_Convert_the_Temperature
{
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }
}
