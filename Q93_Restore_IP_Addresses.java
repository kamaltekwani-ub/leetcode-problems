import java.util.ArrayList;
import java.util.List;

/*
 * Problem Link : https://leetcode.com/problems/restore-ip-addresses/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q93_Restore_IP_Addresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        int length = s.length();
        StringBuilder sb = new StringBuilder();

        for (int aLength = 1; aLength <= 3; aLength++) {
            for (int bLength = 1; bLength <= 3; bLength++) {
                for (int cLength = 1; cLength <= 3; cLength++) {
                    int dLength = length - aLength - bLength - cLength;
                    if (dLength > 0 && dLength <= 3 && aLength + bLength + cLength + dLength == length) {
                        int a = Integer.parseInt(s.substring(0, aLength));
                        int b = Integer.parseInt(s.substring(aLength, aLength + bLength));
                        int c = Integer.parseInt(s.substring(aLength + bLength, aLength + bLength + cLength));
                        int d = Integer.parseInt(s.substring(aLength + bLength + cLength));

                        if (a <= 255 && b <= 255 && c <= 255 && d <= 255) {
                            sb.append(a).append(".").append(b).append(".").append(c).append(".").append(d);

                            if (sb.length() == length + 3)
                                result.add(sb.toString());

                            sb = new StringBuilder();
                        }
                    }
                }
            }
        }

        return result;
    }
}
