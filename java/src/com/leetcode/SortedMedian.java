package com.leetcode;

public class SortedMedian {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] resArr = new int[nums1.length + nums2.length]; // Create a result array to hold merged elements
        int i = 0, j = 0, k = 0; // Initialize pointers for nums1, nums2, and resArr
        while (i < nums1.length && j < nums2.length) { // Merge arrays while both have elements
            if (nums1[i] < nums2[j]) {
                resArr[k++] = nums1[i++]; // Add element from nums1 to resArr
            } else {
                resArr[k++] = nums2[j++]; // Add element from nums2 to resArr
            }
        }
        while (i < nums1.length) { // Add remaining elements from nums1
            resArr[k++] = nums1[i++];
        }
        while (j < nums2.length) { // Add remaining elements from nums2
            resArr[k++] = nums2[j++];
        }
        if (resArr.length % 2 == 0) { // Check if the total number of elements is even
            return (resArr[resArr.length / 2] + resArr[resArr.length / 2 - 1]) / 2.0; // Return the average of the two middle elements
        } else {
            return resArr[resArr.length / 2]; // Return the middle element
        }
    }
}
