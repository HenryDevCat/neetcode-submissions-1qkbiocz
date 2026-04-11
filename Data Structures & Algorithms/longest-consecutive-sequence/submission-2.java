class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }

        int longest = 0;
        for (int num : nums) {
            if (!uniqueNums.contains(num - 1)) {
                int length = 1;
                while (uniqueNums.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
