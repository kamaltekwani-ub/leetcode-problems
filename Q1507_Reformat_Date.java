import java.util.HashMap;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/reformat-date/description/
 * Solution Link : https://leetcode.com/problems/reformat-date/solutions/1749824/easy-java-solution-using-hashmap-and-stringbuilder/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */


public class Q1507_Reformat_Date {
    public String reformatDate(String date) {
        Map<String, String> monthMap = new HashMap<String, String>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");

        String year = date.substring(date.length() - 4, date.length());
        String month = date.substring(date.length() - 8, date.length() - 5);
        String day = date.substring(0, date.length() - 11);

        if (day.length() == 1)
            day = "0" + day;

        StringBuilder sb = new StringBuilder();
        sb.append(year).append("-").append(monthMap.get(month)).append("-").append(day);

        return sb.toString();
    }
}
