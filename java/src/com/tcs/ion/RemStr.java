package com.tcs.ion;

//Remove "7" and "56" from string and print

import java.util.*;

public class RemStr {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		word = word.replace("7", "");
		word = word.replace("56", "");
		System.out.println(word);
	}

}
