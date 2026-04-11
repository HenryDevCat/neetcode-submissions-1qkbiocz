class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>aSet = new HashSet<>();
        for (int i : nums) {
            if (aSet.contains(i)) {
                return true;
            } else {
                aSet.add(i);
            }
        }
        return false;
    }
}