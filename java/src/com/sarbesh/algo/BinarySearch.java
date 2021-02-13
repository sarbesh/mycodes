package com.sarbesh.algo;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        String[] arr = { "contribute", "geeks", "ide", "practice","hell","bell","best","test"};
        String x = "tell";
        int result = Arrays.binarySearch(arr,x);
        System.out.println(result);
    }
}
