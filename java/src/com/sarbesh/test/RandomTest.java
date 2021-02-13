package com.sarbesh.test;

public class RandomTest {

    public static void main(String[] args) {
        findSubString("Sarbesh");

    }

    static void findSubString(String A){
        System.out.println("String:- "+A);
        System.out.println("substring(1);- "+A.substring(1));
        System.out.println("substring(0,2);- "+A.substring(0,2));
    }
}
