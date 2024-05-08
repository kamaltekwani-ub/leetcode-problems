import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1797_Design_Authentication_Manager {
    class AuthenticationManager {
        int timeToLive = 0;
        Map<String, Integer> map;

        public AuthenticationManager(int timeToLive) {
            this.timeToLive = timeToLive;
            map = new HashMap<String, Integer>();
        }

        public void generate(String tokenId, int currentTime) {
            map.put(tokenId, currentTime + timeToLive);
        }

        public void renew(String tokenId, int currentTime) {
            if (!map.containsKey(tokenId) || map.get(tokenId) <= currentTime)
                return;

            map.put(tokenId, currentTime + timeToLive);
        }

        public int countUnexpiredTokens(int currentTime) {
            List<String> tokenIds = new ArrayList<>(map.keySet());
            for (String tokenId : tokenIds) {
                if (map.get(tokenId) <= currentTime)
                    map.remove(tokenId);
            }
            return map.size();
        }
    }
}
