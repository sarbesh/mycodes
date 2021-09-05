import java.util.*;
import java.lang.*;

class Hack1 {
	public Hack1(){
		System.out.println("hack1");
	}

	public void hacker(){
		System.out.println("hello hack1");
	}

	private int hack_method1(int hack){
		return hack++;
	}

	public int hack_method2(int hack){
		System.out.println(hack);
		return hack_method1(hack++);
	}
}

class Hack2 extends Hack1{
	public Hack2(){
		System.out.println("Hack2");
	}

	public void hacker(){
		System.out.println("hello hack2");
	}

	int hack_method1(int hack){
		return hack_method2(++hack);
	}
}

class IntTest{
	public static void main(String args[]){
		System.out.println("Calling H1");
		Hack1 h1 = new Hack2();
		System.out.println("calling H2");
		Hack2 h2 = new Hack2();
		System.out.println("created H1");
		Hack1 h;
		h = h1;
		h1.hacker();
		h2.hacker();
		h.hacker();

		System.out.println(h2.hack_method1(0));
	}
}
