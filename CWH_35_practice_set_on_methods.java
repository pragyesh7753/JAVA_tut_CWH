public class CWH_35_practice_set_on_methods {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);

        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // sum(n) = 1 + 2 + 3...+ n
    // sum(n) = 1 + 2 + 3...+ n-1 + n
    // sum(n) = sum(n-1) + n
    static int sumRec(int n) {
        // Base condition
        if (n == 1) {
            return 1;
        } else {
            return n + sumRec(n - 1);
        }
    }

    static void pattern2(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n) {
        /*
         * if (n == 1) {
         * return 0;
         * }
         * if (n == 2) {
         * return 1;
         * }
         */
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static double average(int... arr) {
        int i = arr.length;
        int sum = 0;
        for (int j : arr) {
            sum = sum + j;
        }
        return (sum / i);

    }

    static void printStar(int n) {
        if (n > 0) {
            printStar(n - 1);
            System.out.print("*");
        }
    }

    static void printStarPat(int n) {
        if (n > 0) {
            printStarPat(n - 1);
        }
        printStar(n);
        System.out.println();
    }

    static void pattern1Rec(int n) {
        if (n > 0) {
            pattern1Rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void CeltoFar(float c) {
        System.out.println((c * 9 / 5) + 32);

    }

    public static void main(String[] args) {
        // Problem 1
        // multiplication(7);

        // Problem 2
        // pattern1(10);

        // Problem 3
        // int c = sumRec(3);
        // System.out.println(c);

        // Problem 4
        // pattern2(4);

        // Problem 5
        // fibonacci series - 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34
        // int result = fib(0);
        // System.out.println(result);

        // Problem 6
        // System.out.println(average(2, 1, 1, 1, 5, 2));

        // Problem 7
        // printStarPat(4);

        // Problem 8
        // pattern1Rec(5);

        // Problem 9
        CeltoFar(31);
    }
}
