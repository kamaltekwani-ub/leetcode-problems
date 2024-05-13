import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Problem Link : https://leetcode.com/problems/time-based-key-value-store/
 * Solution Link : https://leetcode.com/problems/time-based-key-value-store/solutions/4104608/three-simple-java-solutions/    Code-3
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q981_Time_Based_Key_Value_Store
{
    class TimeMap
    {
        Map<String, TreeMap<Integer,String>> map;

        public TimeMap() {
            map = new HashMap<String, TreeMap<Integer,String>>();
        }

        public void set(String key, String value, int timestamp) {
            map.computeIfAbsent(key, k->new TreeMap<Integer,String>()).put(timestamp, value);
        }

        public String get(String key, int timestamp)
        {
            Integer version = map.containsKey(key) ? map.get(key).floorKey(timestamp) : null;
            return version != null ? map.get(key).get(version) : "";
        }
    }
}
