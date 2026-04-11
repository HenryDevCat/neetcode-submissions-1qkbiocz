class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        int leftPtr = 0;
        int rightPtr = s.length() - 1;
        while (leftPtr < rightPtr) {
            while (leftPtr < rightPtr && !Character.isLetterOrDigit(s.charAt(leftPtr))) {
                leftPtr++;
            }
            while (rightPtr > leftPtr && !Character.isLetterOrDigit(s.charAt(rightPtr))) {
                rightPtr--;
            } 
            if (Character.toLowerCase(s.charAt(leftPtr)) != Character.toLowerCase(s.charAt(rightPtr))) {
                return false;
            }
            leftPtr++;
            rightPtr--;
        }
        return true;
    }
}
