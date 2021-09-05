import java.util.*;
import java.lang.*;

class hack1{
	void hack() throws Exception{
		System.out.println("hack1");
	}
}

class TestHack2 extends hack1{
	void hack() throws Exception{
		System.out.println("Hack2");
	}

	public static void main(String args[]){
		TestHack2 h2 = new TestHack2();
		try{
			h2.hack();
		} catch (Exception e){
			System.out.println("hello!");
		} finally {
			System.out.println("final");
		}
	}

}
