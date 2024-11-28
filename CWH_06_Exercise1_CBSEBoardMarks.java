import java.util.Scanner;

public class CWH_06_Exercise1_CBSEBoardMarks {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\t\tWelcome to the the CBSE Board Marks Percentage Calculator :-");
            System.out.println("Enter your marks of 5 subjects as they asked :");
            System.out.println("Enter total marks of Subject 1 : ");
            float tot1 = sc.nextFloat();
            System.out.println("Enter your marks of Subject 1 : ");
            float sub1 = sc.nextFloat();

            System.out.println("Enter total marks of Subject 2 : ");
            float tot2 = sc.nextFloat();
            System.out.println("Enter your marks of Subject 2 : ");
            float sub2 = sc.nextFloat();

            System.out.println("Enter total marks of Subject 3 : ");
            float tot3 = sc.nextFloat();
            System.out.println("Enter your marks of Subject 3 : ");
            float sub3 = sc.nextFloat();

            System.out.println("Enter total marks of Subject 4 : ");
            float tot4 = sc.nextFloat();
            System.out.println("Enter your marks of Subject 4 : ");
            float sub4 = sc.nextFloat();

            System.out.println("Enter total marks of Subject 5 : ");
            float tot5 = sc.nextFloat();
            System.out.println("Enter your marks of Subject 5 : ");
            float sub5 = sc.nextFloat();

            float sum = sub1 + sub2 + sub3 + sub4 + sub5;
            System.out.println("The sum of marks of all subjects is : ");
            System.out.println(sum);

            System.out.println("Your percentage of subject 1 :");
            System.out.println((sub1 * 100) / tot1);
            System.out.println("Your percentage of subject 2 :");
            System.out.println((sub2 * 100) / tot2);
            System.out.println("Your percentage of subject 3 :");
            System.out.println((sub3 * 100) / tot3);
            System.out.println("Your percentage of subject 4 :");
            System.out.println((sub4 * 100) / tot4);
            System.out.println("Your percentage of subject 5 :");
            System.out.println((sub5 * 100) / tot5);

            float total_marks = tot1 + tot2 + tot3 + tot4 + tot5;
            float perc = (sum * 100) / total_marks;
            System.out.println("Your total obtained percentage is here : " + perc);
        }
    }
}
