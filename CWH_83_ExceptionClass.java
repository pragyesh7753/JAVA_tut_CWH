
import java.util.Scanner;

class MyException extends Exception {

    @Override
    public String toString() {
        return super.toString() + " I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am getMessage()";
    }

}

class CWH_83_ExceptionClass {

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        try {
            if (a < 99) {
                throw new MyException();
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
        }
    }
}
