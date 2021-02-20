import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class CheckPrime{
	public static void main(String[] args) throws Exception{
		int N = 17;
		System.out.println(check1(N));
	}

	static boolean check1(int N){
		if(N<=1){
			return false;
		}
		if(N<=3){
			return true;
		}
		if(N%2==0 || N%3==0){
			return false;
		}
		for(int i=5;i*i<=N;i+=6){
			if(N%i==0 || N%(i+2)==0){
				return false;
			}
		}
		return true;
	}
}