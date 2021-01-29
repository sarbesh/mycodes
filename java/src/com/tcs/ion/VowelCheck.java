package com.tcs.ion;
//Find no.of vowels in a given string

import java.util.Arrays;
import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		String[] volv = {"a","e","i","o","u"};
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		while(n>0) {
			String sent = sc.nextLine();
			long startTime = System.currentTimeMillis();
			System.out.println(checkVolv(sent.split(""),volv));
			n--;
			long endTime = System.currentTimeMillis();
			long duration = (endTime - startTime);
			System.out.println(duration);
		}
		sc.close();
	}

	private static int checkVolv(String[] stringArr, String[] volv) {
		int n = 0;
		for (int i = stringArr.length; i > 0; i--) {
			if (Arrays.asList(volv).contains(stringArr[i-1])) {
				n=n+1;
			}
		}
		return n;
	}

}
