package com.sarbesh.algo;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        String[] ar = { "contribute", "geeks", "ide", "practice","hell","bell","best","test"};
        String x = "tell";
        int result = Arrays.binarySearch(ar,x);
        System.out.println(result);

        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 

    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    }
}
