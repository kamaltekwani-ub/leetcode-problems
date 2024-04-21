/*
 * Problem Link : https://leetcode.com/problems/multiply-strings/
 * Solution Link : https://leetcode.com/problems/multiply-strings/solutions/17605/easiest-java-solution-with-graph-explanation/
 *
 * Time Complexity : O(M * N)
 * Space Complexity : O(M + N)
 */



public class Q43_Multiply_Strings
{
    public String multiply(String num1, String num2)
    {
        int m = num1.length();
        int n = num2.length();

        int[] position = new int[m + n];

        for(int i = m - 1; i >= 0; i--)
        {
            for(int j = n - 1; j >= 0; j--)
            {
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = multiply + position[p2];

                position[p1] += sum / 10;
                position[p2] = (sum) % 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int p : position)
            if(!(sb.length() == 0 && p == 0))
                sb.append(p);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
