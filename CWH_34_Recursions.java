// import java.util.Scanner;

public class CWH_34_Recursions {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *.....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)
    // static int factorial(int n) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     } else {
    //         return n * factorial(n - 1);
    //     }
    // }

    // static int factorial_iterative(int n) {
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     } else {
    //         int product = 1;
    //         for (int i = 1; i <= n; i++) {
    //             product *= i;
    //         }
    //         return product;
    //     }
    // }

    
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        // System.out.println("Enter the number : ");
        // int x = S.nextInt();
        // // int x = 11;
        // System.out.println("The value of factorial x is: " + factorial(x));
        // System.out.println("The value of factorial x is: " + factorial_iterative(x));

        // Quiz - Fibonacci Series
        int n = 3;
        System.out.println(fib(n));
    }
}
