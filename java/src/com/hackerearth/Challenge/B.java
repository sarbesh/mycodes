class A{
    public A(){}
    public A(int i ){
        System.out.println(i);
    }

}

public class B {
    static A s1 = new A(1);
    A a = new A(2);

    public static void main(String[] args) {
        B b = new B();
        // a = new A(3); //reference non-static from static
    }
    static A s2 = new A(4);
}
