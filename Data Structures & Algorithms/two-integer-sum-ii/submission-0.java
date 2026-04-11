class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int leftPtr = 0;
        int rightPtr = numbers.length - 1;
        while (leftPtr < rightPtr) {
            while (numbers[leftPtr] + numbers[rightPtr] < target) {
                leftPtr++;
            }
            while (numbers[leftPtr] + numbers[rightPtr] > target) {
                rightPtr--;
            }
            if (numbers[leftPtr] + numbers[rightPtr] == target) {
                return new int[]{leftPtr + 1, rightPtr + 1};
            }
        }
        return new int[2];
    }
}
