
// import java.util.Scanner;

// class MyException extends Exception {

//     @Override
//     public String toString() {
//         // return super.toString() + " I am toString()";
//         return super.toString() + " I am toString()";
//     }

//     @Override
//     public String getMessage() {
//         // return super.getMessage() + " I am getMessage()";
//         return super.getMessage() + " I am getMessage()";
//     }

// }

// class MaxAgeException extends Exception {
//     @Override
//     public String toString() {
//         return "Age cannot be greater than 125";
//     }

//     @Override
//     public String getMessage() {
//         return "Make sure that the value of age entered is correct";
//     }
// }

// class CWH_83_ExceptionClass {

//     public static void main(String[] args) {
//         int a;
//         try (Scanner sc = new Scanner(System.in)) {
//             a = sc.nextInt();
//         }
//         try {
//             if (a < 99) {
//                 throw new MyException();
//                 // throw new ArithmeticException("This is an exception");
//             }
//         } catch (MyException e) {
//             System.out.println(e.getMessage());
//             System.out.println(e.toString());
//             // System.out.println(e);
//             e.printStackTrace();
//             System.out.println("Finished");
//         }
//         System.out.println("Yes Finished");
//     }
// }