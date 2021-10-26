/*
Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false
 
Constraints:
-231 <= x <= 231 - 1*/

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String strInt = String.valueOf(x);
        boolean result = false;
        if (strInt.length() == 1) {
            return true;
        } else {
            for (int i = 0; i < (strInt.length() / 2); i++) {
                if ((strInt.charAt(i)) != (strInt.charAt((strInt.length() - 1) - i))) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
            return result;
        }
    }
}
