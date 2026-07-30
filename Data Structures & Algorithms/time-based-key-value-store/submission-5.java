class TimeMap {
    Map<String, List<Pair>> aMap;

    public TimeMap() {
        aMap = new HashMap<>();    
    }
    
    public void set(String key, String value, int timestamp) {
        if (!aMap.containsKey(key)) {
            aMap.put(key, new ArrayList());
        }
        aMap.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!aMap.containsKey(key)) {
            return "";
        }

        int l = 0;
        List<Pair> aList = aMap.get(key);
        int r = aList.size() - 1;
        
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (aList.get(mid).timestamp == timestamp) {
                return aList.get(mid).value;
            }

            if (aList.get(mid).timestamp > timestamp) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        if (r >= 0) {
            return aList.get(r).value;
        } else {
            return "";
        }
    }
}

class Pair {
    String value;
    int timestamp;

    public Pair(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
