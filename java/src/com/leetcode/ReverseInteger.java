package com.leetcode;

//https://leetcode.com/problems/reverse-integer/
/*
* Given a signed 32-bit integer x, return x with its digits reversed.
* If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
* then return 0.Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
* */
public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0; // Initialize the reversed number
        while (x != 0) {
            int pop = x % 10; // Pop the last digit from x
            x /= 10; // Reduce x by removing the last digit
            // Check for overflow: if rev is greater than the max value divided by 10, or if rev is at the max value and the next digit causes overflow
            // Integer.MAX_VALUE is 2147483647, so Integer.MAX_VALUE / 10 is 214748364
            // The last digit 7 is used to check if appending another digit would cause overflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Return 0 if overflow would occur
            }
            // Check for underflow: if rev is less than the min value divided by 10, or if rev is at the min value and the next digit causes underflow
            // Integer.MIN_VALUE is -2147483648, so Integer.MIN_VALUE / 10 is -214748364
            // The last digit -8 is used to check if appending another digit would cause underflow
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Return 0 if underflow would occur
            }
            rev = rev * 10 + pop; // Append the popped digit to the reversed number
        }
        return rev; // Return the reversed number
    }
}
