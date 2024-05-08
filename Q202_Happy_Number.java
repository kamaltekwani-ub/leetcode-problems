/*
 * Problem Link : https://leetcode.com/problems/happy-number/
 * Solution Link : https://leetcode.com/problems/happy-number/solutions/3767573/easy-java-solution-two-pointers-floyd-s-tortoise-and-hare-detailed-explanation
 *
 * Time Complexity : O(N)
 * Space Complexity : O(N)
 */

public class Q202_Happy_Number {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        // while loop is not used here because initially slow and
        // fast pointer will be equal only, so the loop won't run.
        do {
            //slow moving one step ahead and fast moving two steps ahead

            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        // If a cycle exists, then the number is not a happy number
        // and slow will have a value other than 1

        return slow == 1;
    }

    //Finding the square of the digits of a number

    public int square(int num) {

        int ans = 0;

        while (num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }

        return ans;
    }

    /*
    public boolean isHappy(int n)
    {
        Set<Integer> set = new HashSet<>();

        while(true)
        {
            int sum=0;
            while(n != 0)
            {
                int remainder = n % 10;
                sum += (remainder*remainder);
                n = n / 10;
            }

            if(!set.add(sum))
                return false;

            if(sum == 1)
                return true;

            n = sum;
        }
    }
    */
}
