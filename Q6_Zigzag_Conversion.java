/*
 * Problem Link : https://leetcode.com/problems/zigzag-conversion/
 * Solution Link : https://leetcode.com/problems/zigzag-conversion/solutions/4364090/easy-green-beats/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q6_Zigzag_Conversion
{
    public static String convert(String s, int numRows)
    {
        int length = s.length();
        StringBuffer[] sbArray = new StringBuffer[numRows];

        int index = 0;
        for(index=0 ; index<numRows ; index++)
            sbArray[index] = new StringBuffer();

        index = 0;

        while(index < length){
            // Vertically Downward
            for(int i=0 ; i<numRows && index<length ; i++)
                sbArray[i].append(s.charAt(index++));


            // Vertically Upward
            for(int i=numRows-2 ; i>0 && index<length ; i--)
                sbArray[i].append(s.charAt(index++));
        }

        StringBuffer sb = new StringBuffer();
        for(StringBuffer sbTemp : sbArray){
            sb.append(sbTemp);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Result - "+convert("PAYPALISHIRING", 3));
    }
}
