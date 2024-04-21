import java.util.HashSet;
import java.util.Set;

public class Q929_Unique_Email_Addresses
{
    // Link : https://leetcode.com/problems/unique-email-addresses/solutions/804556/java-simple-solution/

    // Time Complexity : O(N)
    // Space Complexity : O(N)

    public int numUniqueEmails(String[] emails)
    {
        Set<String> set = new HashSet<>();
        for(String addr : emails) {
            String[] parts = addr.split("@");
            parts[0] = parts[0].replaceAll("\\.", "");
            set.add(parts[0].split("\\+")[0]+"@"+parts[1]);
        }
        return set.size();
    }
}
