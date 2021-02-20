import java.util.*;
import java.lang.*;
import java.io.*;

class INTTOSTR{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = String.valueOf(n);
		if(n<=100 && n>=-100){
			System.out.println("Good job");
		} else{
			System.out.println("Wrong answer");
		}
	}
}