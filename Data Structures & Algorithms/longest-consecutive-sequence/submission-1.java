class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }

        int longest = 0;
        int length = 0;
        for (int num : nums) {
            // Check if num is the start of a sequence by
            // checking if num - 1 exists in set
            if (!uniqueNums.contains(num - 1)) {
                // num is start of a sequence
                length = 1;
                // Check if next num in sequence exists in set
                while (uniqueNums.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}
