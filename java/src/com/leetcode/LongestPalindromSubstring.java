package com.leetcode;

//Generated with Cascade for https://leetcode.com/problems/longest-palindromic-substring/description/
public class LongestPalindromSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return ""; // Return empty string if input is null or empty
        int start = 0, end = 0; // Initialize start and end pointers for the longest palindrome
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Check for odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Check for even length palindromes
            int len = Math.max(len1, len2); // Get the maximum length palindrome
            if (len > end - start) { // Update start and end if a longer palindrome is found
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1); // Return the longest palindrome substring
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right; // Initialize left and right pointers
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) { // Expand as long as the characters match
            L--;
            R++;
        }
        return R - L - 1; // Return the length of the palindrome
    }
}
