import java.util.*;
import java.io.*;
import java.lang.*;

public class Test{
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
    	String[] B = A.split("");
    	System.out.println(B.length);
    	Arrays.stream(B).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}