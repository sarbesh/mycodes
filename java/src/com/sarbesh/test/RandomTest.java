package com.sarbesh.test;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RandomTest {

    public static void main(String[] args) throws Exception{
        findSubString("Sarbesh");
        strlen("Sarbesh");
    }

    static void findSubString(String A){
        System.out.println("String:- "+A);
        System.out.println("substring(1);- "+A.substring(1));
        System.out.println("substring(0,2);- "+A.substring(0,2));
    }

    static void strlen(String A){
    	System.out.println(A.length());
    }
}
