import java.util.HashMap;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/design-underground-system/
 * Solution Link : https://leetcode.com/problems/design-underground-system/solutions/672744/java-solution-for-easy-understanding-using-oops/
 *
 * Time Complexity :
 * Space Complexity :
 */


public class Q1396_Design_Underground_System {
    class UndergroundSystem {
        Map<Integer, Passenger> passengerMap;
        Map<String, double[]> routeMap;
        public UndergroundSystem() {
            passengerMap = new HashMap<Integer, Passenger>();
            routeMap = new HashMap<String, double[]>();
        }

        public void checkIn(int id, String stationName, int t) {
            Passenger passenger = new Passenger(id, stationName, t);
            passengerMap.put(id, passenger);
        }

        public void checkOut(int id, String stationName, int t) {
            Passenger passenger = passengerMap.get(id);
            String route = passenger.stationName + "-" + stationName;
            double time[] = routeMap.getOrDefault(route, new double[2]);
            time[0] = time[0] + (t - passenger.time);
            time[1] += 1;
            routeMap.put(route, time);
        }

        public double getAverageTime(String startStation, String endStation) {
            String route = startStation + "-" + endStation;
            double time[] = routeMap.get(route);
            return time[0] / time[1];
        }

        class Passenger {
            int id;
            String stationName;
            int time;

            public Passenger(int id, String stationName, int time) {
                this.id = id;
                this.stationName = stationName;
                this.time = time;
            }
        }
    }

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
}
