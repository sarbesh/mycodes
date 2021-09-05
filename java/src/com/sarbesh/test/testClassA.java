import java.lang.*;
import java.util.*;

class testClassA{
	class A{
		public A(){
		}

		public A(int i){
			System.out.println(i);
		}
	}

	class B {
		static A S1 = new A(1);
		A a = new A(2);

		public static void main(String[] args){
			B b = new B();
			A a = new A(3);
			// static A S2 = new A(4);
		}
	}
}