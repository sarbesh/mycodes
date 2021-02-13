package com.tcs.ion;

//Remove "7" and "56" from string and print

import java.util.*;
import java.lang.*;

public class RemStr {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		method1(word);
		method2(word);
		method3(word);
	}

	//Third
	public static void method1(String word1){
		final long startTime = System.nanoTime();
		String[] word = word1.split("");
		StringBuilder result = new StringBuilder();
		int i =0;
		while (i<word.length){
			if ("7".equals(word[i])){
				i++;
			} else if ("5".equals(word[i])){
				if (i+1<word.length && "6".equals(word[i+1]) ){
					i=i+2;
				} else {
					result.append(word[i]);
					i++;
				}
			} else {
				result.append(word[i]);
				i++;
			}
		}
		final long endTime = System.nanoTime();
		System.out.println(result);
		System.out.println("Method1 Total execution time: " + (endTime - startTime));
	}

	//Fastest
	public static void method2(String word){
		final long startTime = System.nanoTime();
		word = word.replace("7", "");
		word = word.replace("56", "");
		final long endTime = System.nanoTime();
		System.out.println(word);
		System.out.println("Method2 Total execution time: " + (endTime - startTime));
	}

	//Second
	public static void method3(String word1){
		final long startTime = System.nanoTime();
		String[] word = word1.split("");
		StringBuilder result = new StringBuilder();
		int len = word.length;
		int i =0;
		while (i<len){
			String ch = word[i];
			if ("7".equals(ch)){
				i++;
			} else if ("5".equals(ch)){
				if (i+1<len && "6".equals(word[i+1]) ){
					i=i+2;
				} else {
					result.append(ch);
					i++;
				}
			} else {
				result.append(ch);
				i++;
			}
		}
		final long endTime = System.nanoTime();
		System.out.println(result);
		System.out.println("Method3 Total execution time: " + (endTime - startTime));
	}

}
