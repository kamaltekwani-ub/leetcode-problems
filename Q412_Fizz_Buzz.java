import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/fizz-buzz/
 * Solution Link : https://leetcode.com/problems/fizz-buzz/solutions/2628136/java-3-approaches-easy
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q412_Fizz_Buzz
{
    public List<String> fizzBuzz(int n)
    {
        List<String> list = new ArrayList<String>();

        for(int value=1 ;  value<=n ; value++)
        {
            String result = String.valueOf(value);

            if(value % 3 == 0 && value % 5 == 0)
                result = "FizzBuzz";
            else if(value % 3 == 0)
                result = "Fizz";
            else if(value % 5 == 0)
                result = "Buzz";

            list.add(result);
        }

        return list;
    }
}
