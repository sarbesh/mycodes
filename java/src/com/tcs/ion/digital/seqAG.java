// Given sequence find nth value
//1 2 3 4 5 6 7 8 9......
//0 0 2 1 4 3 6 5 8......
// Example:
//input		10	12	15
//output	7	9	14
//solution:- except for 1,2 if odd:- N-1; if even N-3

import java.util.*;
import java.lang.*;
import java.io.*;

public class aeqAG{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		if(N==1){
			prnt(0);
		} else if(N==2){
			prnt(0);
		} else if(N%2==0){
			prnt(N-3);
		} else{
			prnt(N-1);
		}
	}

	static void prnt(int N){
		System.out.println(N);
	}
}