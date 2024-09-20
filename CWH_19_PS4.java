import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class CWH_19_PS4 {
    public static void main(String[] args) {
        // Question1
        // int a = 10;
        // if (a = 11) {
        // System.out.println("I am 11.");
        // } else {
        // System.out.println("I am not 11.");
        // } // this will throw error

        // Question2
        // byte m1, m2, m3;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your marks in Physics : ");
        // m1 = sc.nextByte();

        // System.out.print("Enter your marks in Chemistry : ");
        // m2 = sc.nextByte();

        // System.out.print("Enter your marks in Mathematics : ");
        // m3 = sc.nextByte();
        // float avg = (m1 + m2 + m3) / 3.0f;
        // System.out.println("Your Overall percentage is " + avg);

        // if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
        // System.out.println("Congratulations you have been promoted.");
        // } else {
        // System.out.println("Sorry you have not been promoted! Please try again.");
        // }

        // Question3
        // System.out.print("Enter your income in lakhs per annum : ");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if (income <= 2.5) {
        // tax = tax + 0;
        // } else if (income > 2.5f && income <= 5f) {
        // tax = tax + 0.05f * (income - 2.5f);
        // }

        // else if (income > 5f && income <= 10f) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (income - 2.5f);
        // }

        // else if (income > 10.0f) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (10.0f - 5f);
        // tax = tax + 0.3f * (income - 10.0f);
        // }

        // System.out.print("The total tax paid by employee : " + tax);

        // Question4
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter day no. : ");
        // int day = sc.nextInt();
        // switch (day) {
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wedenesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // case 7 -> System.out.println("Sunday");

        // Question5
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a year :");
        // int yr = sc.nextInt();
        // if ((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0) {
        // System.out.println("Your inputted year is a leap year.");
        // } else {
        // System.out.println("Sorry this is not a leap year.");
        // }

        // Question6
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a website : ");
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an Organisational website.");
        } else if (website.endsWith(".com")) {
            System.out.println("This is an Commercial website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website.");
        }

    }

}
