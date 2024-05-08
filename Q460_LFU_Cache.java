import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/*
 * Problem Link : https://leetcode.com/problems/lfu-cache/description/
 * Solution Link :
 *
 * Time Complexity :
 * Space Complexity :
 */

public class Q460_LFU_Cache {
    class LFUCache {
        int minimumFrequency;
        Map<Integer, Integer> keyValueMap;
        Map<Integer, Integer> keyFrequencyMap;
        Map<Integer, LinkedHashSet<Integer>> frequencyLRUKeyMap;
        private int capacity;

        public LFUCache(int capacity) {
            this.capacity = capacity;
            this.minimumFrequency = 0;
            this.keyValueMap = new HashMap<>();
            this.keyFrequencyMap = new HashMap<>();
            this.frequencyLRUKeyMap = new HashMap<>();
        }

        public int get(int key) {
            if (!keyValueMap.containsKey(key))
                return -1;

            int frequency = keyFrequencyMap.get(key);
            frequencyLRUKeyMap.get(frequency).remove(key);
            if (frequency == minimumFrequency && frequencyLRUKeyMap.get(frequency).isEmpty()) {
                frequencyLRUKeyMap.remove(frequency);
                ++minimumFrequency;
            }

            // Increase key's freq by 1
            // Add this key to next freq's list
            putFreq(key, frequency + 1);
            return keyValueMap.get(key);
        }

        public void put(int key, int value) {
            if (capacity == 0)
                return;

            if (keyValueMap.containsKey(key)) {
                keyValueMap.put(key, value);
                get(key); // Update key's count
                return;
            }

            if (keyValueMap.size() == capacity) {
                // Evict LRU key from the minimumFrequency list
                int keyToEvict = frequencyLRUKeyMap.get(minimumFrequency).iterator().next();
                frequencyLRUKeyMap.get(minimumFrequency).remove(keyToEvict);
                keyFrequencyMap.remove(keyToEvict);
                keyValueMap.remove(keyToEvict);
            }

            minimumFrequency = 1;
            putFreq(key, minimumFrequency); // Add new key and freq
            keyValueMap.put(key, value); // Add new key and value
        }

        private void putFreq(int key, int frequency) {
            keyFrequencyMap.put(key, frequency);
            frequencyLRUKeyMap.putIfAbsent(frequency, new LinkedHashSet<>());
            frequencyLRUKeyMap.get(frequency).add(key);
        }
    }
}
