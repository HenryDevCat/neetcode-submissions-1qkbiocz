class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        int leftPtr = 0;
        int rightPtr = s.length() - 1;
        while (leftPtr < rightPtr) {
            if (!Character.isLetterOrDigit(s.charAt(leftPtr))) {
                leftPtr++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(rightPtr))) {
                rightPtr--;
                continue;
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
