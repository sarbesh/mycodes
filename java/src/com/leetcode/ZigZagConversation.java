package com.leetcode;

//https://leetcode.com/problems/zigzag-conversion/description/
public class ZigZagConversation {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int index = 0;
        int direction = 1; // 1 for down, -1 for up
        for (int i = 0; i < s.length(); i++) {
            rows[index].append(s.charAt(i));
            if (index == 0) {
                direction = 1;
            } else if (index == numRows - 1) {
                direction = -1;
            }
            index += direction;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}
