import java.util.Scanner;

class maxRetriesException extends Exception {
    @Override
    public String toString() {
        return "Maximum Retries Limit Reached";
    }

    @Override
    public String getMessage() {
        return "Maximum Retries Limit Reached";
    }
}

public class CWH_86_PS14 {
    public static void main(String[] args) throws maxRetriesException {
        // Problem 1
        // Syntax Error => int a = 7;
        // Logical Error => int age = 78;
        // int year_born = 2000-78;
        // System.out.println(6/0); // Exception

        // Problem 2
        // try {
        // int a = 666 / 0;
        // } catch (IllegalArgumentException e) {
        // System.out.println("HeHe");
        // } catch (ArithmeticException e) {
        // System.out.println("HaHa");
        // }

        // Problem 3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.print("Enter the value of index: ");
                index = sc.nextInt();
                System.out.print("The value of marks[index] is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        // if (i >= 5) {
        // System.out.println("Error!");
        // }

        // Problem 4
        if (i >= 5) {
            throw new maxRetriesException();
        }
    }
}
