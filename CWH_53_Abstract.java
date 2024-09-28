/**
 * This Java program demonstrates the concept of abstract classes and inheritance with a parent class
 * and two child classes, one of which is abstract.
 */
abstract class Parent {

    public Parent() {
        System.out.println("Mai Base Class ka Constructor hoon");
    }

    public void sayHello() {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class Child2 extends Parent{
    
    public void th(){
        System.out.println("I am good");
    }
}

public class CWH_53_Abstract {

    public static void main(String[] args) {
        // Parent c = new Parent();  // Error because we can't create object of abstract class
        Child c = new Child();
        // Child2 c2 = new Child2(); // Error because we can't create object of abstract class

    }
}
