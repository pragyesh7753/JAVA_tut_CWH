 // class Circle {
//     public int radius;
//     // Circle(){
//     //     System.out.println("I am non param of circle");
//     // }
//     Circle(int r) {
//         System.out.println("I am circle parameterized constructor");
//         this.radius = r;
//     }
//     public double area() {
//         return Math.PI * this.radius * this.radius;
//     }
// }
// class Cylinder1 extends Circle {
//     public int height;
//     Cylinder1(int r, int h) {
//         super(r);
//         System.out.println("I am cylinder1 parameterized constructor");
//         this.height = h;
//     }
//     public double volume() {
//         return Math.PI * this.radius * this.radius * this.height;
//     }
// }
class Rectangle {

    public int length;
    public int breadth;
    

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area() {
        return this.length * this.breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {

    public int height;

    Cuboid(int l, int b, int h) {
        super(l, b);
        this.height = h;
    }

    public int volume() {
        return this.length * this.breadth * this.height;
    }
}

public class CWH_52_Ch10PS {

    public static void main(String[] args) {
        // Problem 1 & 3
        // Circle objC = new Circle(12);
        // Cylinder1 obj = new Cylinder1(12, 4);
        // System.out.println(obj.area());
        // System.out.println(obj.volume());

        // Problem 2 & 4
        Rectangle objR = new Rectangle(12, 4);
        Cuboid obj = new Cuboid(12, 4, 6);
        System.out.println(obj.volume());
        System.out.println(objR.area());
    }
}
