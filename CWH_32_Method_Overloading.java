
public class CWH_32_Method_Overloading {
    static void foo() {
        System.out.println("Good morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    // static int foo(int a, int b) {
    // System.out.println("Good morning " + a + " bro!");
    // System.out.println("Good morning " + b + " bro!");
    // return 3;
    // } //method overloading cannot be performed by changing the return type type
    // of methods

    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void tellJoke() {
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    public static void main(String[] args) {
        // tellJoke();
        // Case 1: Changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is: " + x); //does
        // not change because copy of the value goes in method
        // Case 2
        // int[] marks = { 52, 73, 77, 89, 98, 94 };
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]); //
        // in case of array, reference is
        // // passed, so value of marks[0] is
        // // changed
        // array is declared as a object

        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000); // arguments are actual!
    }
}