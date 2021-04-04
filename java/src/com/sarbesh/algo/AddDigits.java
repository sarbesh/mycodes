package com.sarbesh.algo;

import java.util.*;
import java.io.*;
import java.lang.*;

public class AddDigits{
	public static void main(String args[]) throws Exception{
		int n = 2147483647;
		int sum=0;
		while(n!=0){
			sum = sum+(n%10);
			n = n/10;
		}
		System.out.println(sum);
	}
}