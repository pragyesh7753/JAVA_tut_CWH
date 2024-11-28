import java.util.Scanner;

public class CWH_25_Practice_Set_5 {
    public static void main(String[] args) {
        // Practice Problem 1
        // int n = 4;
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // Practice Problem 2
        // int i = 0;
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = sc.nextInt();
        // while (i < n) {
        // sum = sum + (2 * i);
        // i++;
        // }
        // System.out.print("Sum of even numbers is : ");
        // System.out.println(sum);

        // Practice Problem 3
        // for (int i = 0; i < 10; i++) // Goes from i = 0 to i = 9
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.printf("%d X %d = %d\n", n, i, n * i);
        // }

        // Practice Problem 4
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value of n : ");
        // int n = sc.nextInt();
        // for (int i = 10; i >= 1; i--) {
        // System.out.printf("%d X %d = %d\n", n, i, n * i);
        // }

        // Practice Problem 5
        // int n = 5;
        // int factorial = 1;
        // for (int i = 1; i <= n; i++) {
        // factorial *= i;
        // }
        // System.out.println(factorial);

        // Practice Problem 6
        // int n = 5;
        // int i = 1;
        // int factorial = 1;
        // while (i <= n) {
        // factorial *= i;
        // i++;
        // }
        // System.out.println(factorial);

        // Practice Problem 7
        // int i = 4;
        // while (i > 0) {
        // int j = 0;
        // while (j++ < i) {
        // System.out.print("*");
        // }
        // i--;
        // System.out.print("\n");
        // }

        // Practice Problem 8
        // True

        // Practice Problem 9
        // int n = 8;
        // int sum = 0;
        // for (int i = 1; i <= 10; i++) {
        // sum += n * i;
        // }
        // System.out.println(sum);

        // Practice Problem 10
        // 1. At least once

        try (// Practice Problem 11
        Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the value of n : ");
            int n = scan.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + (2 * i);
            }
            System.out.println("Sum of first n even numbers is : " + sum);
        }
    }
}
