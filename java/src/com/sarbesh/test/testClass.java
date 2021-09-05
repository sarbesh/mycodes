import java.lang.*;
import java.util.*;


public class testClass{
	public static void main(String[] args){

		
	}

	public static void testM(boolean val){
		if (val) {
			if (val) {
				if (val) {
					System.out.println("true true"); // when true
				} else{
					System.out.println("false true"); //never exec
				}
			} else{
				System.out.println("true false"); //never exec
			}
		} else {
			System.out.println("false false"); //when false
		}
	}
}