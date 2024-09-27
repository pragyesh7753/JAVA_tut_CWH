/**
 * The code defines classes A and B where class B overrides a method from class A and demonstrates
 * method overriding in Java.
 */

class A {

    public int a;

    public int pks() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {

    @Override
    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }

}

public class CWH_48_Method_Overriding {

    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}