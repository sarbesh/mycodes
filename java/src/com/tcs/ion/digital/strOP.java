//given a string find number of operations(remove, replace, insert) 
//that can be performed on it to get second given string
//Example:
//input: 	morning			convent
//		bring			contant
//output	3			2
//		remove 'm'		convert 'v' -> 't'
//		replace 'o' -> 'b'	convert 'e' -> 'a'
//		remove 'n'
//This will resolve first public test case and 3 private given, but second public test cases fails

import java.util.*;
import java.lang.*;
import java.io.*;

public class strOP{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = "convent";//sc.nextLine();
		String B = "contant";//sc.nextLine();
		char[] ca = A.toCharArray();
		char[] cb = B.toCharArray();
		//solution pending
		int lena = A.length();
		int lenb = B.length();
		int diff=0;
		if(lena>lenb){
			diff=lena-lenb;
		} else diff=lenb-lena;
		int cnt=0;
		for(int i=0;i<cb.length;i++){
			char b = cb[i];
			boolean fnd = false;
			for(int j=0;j<ca.length;j++){
				if(ca[j]==b){
					fnd=true;
					break;
				}
			}
			if(!fnd){
				cnt++;
			}
		}
		prnt(diff+cnt);
	}

	static void prnt(int N){
		System.out.println(N);
	}
}
