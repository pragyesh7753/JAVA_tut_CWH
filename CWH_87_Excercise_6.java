import java.util.Scanner;

class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "You have given an invalid input!";
    }
}

class DivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Dividing any number with zero is not possible!";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "You can not give input greater than 100000!";
    }
}

class MaxMultiplierException extends Exception {
    @Override
    public String toString() {
        return "You can not give input for multiplication greater than 7000!";
    }
}

public class CWH_87_Excercise_6 {
    static int n;
    static double num1;
    static double num2;
    static Scanner sc = new Scanner(System.in);

    public static void takeInput() {
        System.out.print("Input two numbers: \n\tInput first number: ");
        num1 = sc.nextInt();
        System.out.print("\tInput second number: ");
        num2 = sc.nextInt();
    }

    public static double add() throws MaxInputException, InvalidInputException {
        takeInput();
        if (num1 > 100000 || num2 > 100000) {
            throw new MaxInputException();
        }
        if (num1 == 8 || num2 == 9) {
            throw new InvalidInputException();
        }
        return num1 + num2;
    }

    public static double sub() throws MaxInputException {
        takeInput();
        if (num1 > 100000 || num2 > 100000) {
            throw new MaxInputException();
        }
        return num1 - num2;
    }

    public static double mul() throws MaxInputException, MaxMultiplierException {
        takeInput();
        if (num1 > 100000 || num2 > 100000) {
            throw new MaxInputException();
        }
        if (num1 > 7000 || num2 > 7000) {
            throw new MaxMultiplierException();
        }
        return num1 * num2;
    }

    public static double div() throws MaxInputException, DivideByZeroException {
        takeInput();
        if (num1 > 100000 || num2 > 100000) {
            throw new MaxInputException();
        }
        if (num2 == 0) {
            throw new DivideByZeroException();
        }
        return num1 / num2;
    }

    public static void main(String[] args)
            throws InvalidInputException, DivideByZeroException, MaxInputException, MaxMultiplierException {
        /*
         * Excercise - 6: You have to create a custom calculator with following
         * operations:
         * 1. (+) -> Addition
         * 2. (-) -> Subtraction
         * 3. (*) -> Multiplication
         * 4. (/) -> Division
         * which throws the following exceptions:
         * 1. Invalid input exception if n is 8 or 9
         * 2. Cannot divide by 0 exception
         * 3. Max Input Exception if any of the inputs is greater than 100000
         * 4. Max multiplier reached exception - don't allow any multiplication input to
         * be greater than 7000
         */

        System.out.println("\t\t\tWelcome to Custom Calculator by PKS");
        System.out.println(
                "What do you want to do: \nPress 1 for Addition \nPress 2 for Subtraction \nPress 3 for Multiplcation \nPress 4 for Division");
        n = sc.nextInt();
        switch (n) {
            case 2 -> System.out.println(sub());
            case 1 -> System.out.println(add());
            case 3 -> System.out.println(mul());
            case 4 -> System.out.println(div());
            default -> {
                System.out.println("Wrong Input!");
            }
        }
    }
}
