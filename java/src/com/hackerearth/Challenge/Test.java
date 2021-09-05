import java.util.*;
import java.lang.*;
import java.util.stream.*;

class A{
	public A(){}

	public A(int i){System.out.println(i);};
}

abstract class Animal{
	abstract void eat();
}

class Dog extends Animal{
	void eat(){
		System.out.println("Dog eat biscuit");
	}
}

class Cat extends Animal{
	void eat(){
		System.out.println("Cat eat fish");
	}
}

interface Flyer{}

class Bird implements Flyer{}

class Eagle extends Bird{}

class Bat{}

class Message{
	public void printMessage(){
		 System.out.println("Hello world!");
	}
}

class Test{

	static A a1 = new A(1);
	A a2 = new A(2);
	public static void main(String[] args){

		Test tst = new Test();
		A a3 = new A(3);

		int i=0;
		int[] iA= {10,20};
		iA[i]=i=30;
		System.out.println(" "+iA[0]+" "+iA[1]+" "+i); //30 20 30

		Stream<String> st = Stream.iterate("",(str)->str+"x");
		System.out.println(st.limit(3).map(str->str+"y"));

		String[] names = {"charle", "Bob", "Alice", "Don"};
		Collections.sort(Arrays.asList(names),null);
		System.out.println(names[0]); //Alice

		int[] s1 = {1,2,3,4,5,6};
		int[] s2 = null;
		//System.arraycopy(s1,2,s2,0,2); //Nullpointer
		//for(int s2i: s2) System.out.print(s2i);

		int ia=1;
		double db = 3.0;
		System.out.println(ia+db); //4.0

		Animal[] animals = new Dog[2];
		animals[0] = new Dog();
		//animals[1] = new Cat(); //ArrayStoreException
		//animals[0].eat();
		//animals[1].eat();

		Flyer fly = new Eagle();
		Eagle egl = new Eagle();
		Bat bat = new Bat();
		if(fly instanceof Flyer) {System.out.println("F is flyer");}
		if(egl instanceof Bird) {System.out.println("Egl is Bird");}
		//if(bat instanceof Bird) {System.out.println("Bat is Bird");} //Compilation Error incompatible Type

		Message m1 = new Message(){
			public void printMessage(){
				 System.out.println("Hello inner world!");
			}
		};
		m1.printMessage();
		Message m2 = new Message(){
			public void PrintMessage(){
				 System.out.println("Hello world!");
			}
		};
		//m2.PrintMessage(); //Compilation Error Can not find Symbol

		int tstN = Integer.parseInt(args[0]);
		switch(tstN){
			case 3: System.out.println("Low!"); break;
			case 7: System.out.println("High!");
			default: System.out.println("Default!"); break;
		}

	}
	static A a4 = new A(4); 
	//1,4,2,3
}
