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
import java.math.*;

public class strOP{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		char[] ca = A.toCharArray();
		char[] cb = B.toCharArray();
		int lena = A.length();
		int lenb = B.length();
		int ans = lcs(ca, cb,lena, lenb);
		prnt(ans);
	}

	static void prnt(int N){
		System.out.println(N);
	}

	public static int lcs(char[] X, char[] Y, int m, int n){
		int dp[][] = new int[m+1][n+1];
		for (int i =0;i<=m ;i++ ) {
			for (int j=0;j<=n ;j++ ) {
				if(i==0||j==0){
					dp[i][j]=0;
				} else if(X[i-1]==Y[j-1]){
					dp[i][j] = dp[i-1][j-1]+1; 
				}else{
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}
}
