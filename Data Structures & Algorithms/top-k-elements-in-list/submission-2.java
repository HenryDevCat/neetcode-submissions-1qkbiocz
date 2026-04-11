class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Count the frequency
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Bucket (0..nums.length + 1)
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            bucket[entry.getValue()].add(entry.getKey());            
        }

        int[] res = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i > 0 && idx < k; i--) {
            for (int j : bucket[i]) {
                res[idx++] = j;
                if (idx == k) {
                    return res;
                }
            }
        }
        
        return res;
    }
}
