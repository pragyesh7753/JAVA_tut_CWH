/**
 * The code defines two classes, `EkClass` and `DoClass`, where `DoClass` is a subclass of `EkClass`,
 * and demonstrates the use of `this` and `super` keywords in Java.
 */

class EkClass {

    int a;

    EkClass(int a) {
        this.a = a;
    }

    public int returnOne() {
        return 1;
    }

    public int getA() {
        return a;
    }
}

class DoClass extends EkClass {

    DoClass(int c) {
        super(c);
        System.out.println("Mai ek constructor hu");
    }
}

public class CWH_47_this_super {

    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        DoClass d=new DoClass(5);
        System.out.println(e.getA());
        System.out.println(d.getA());
    }
}
