
class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * 3.142 * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

}

class Sphere {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}

public class CWH_44_PS09 {
    public static void main(String[] args) {

        // Problem 1
        // Cylinder myCylinder = new Cylinder(9, 12);
        // myCylinder.setHeight(12);
        // System.out.println(myCylinder.getHeight());
        // myCylinder.setRadius(9);
        // System.out.println(myCylinder.getRadius());

        // // Problem 2
        // System.out.println(myCylinder.surfaceArea());
        // System.out.println(myCylinder.volume());

        // // Problem 3

        // // Problem 4
        // Rectangle r = new Rectangle(12, 56);
        // System.out.println(r.getLength());
        // System.out.println(r.getBreadth());

        // Problem5
        Sphere s = new Sphere();
        s.setRadius(45);
        System.out.println(s.getRadius());
    }
}
