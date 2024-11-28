import java.util.Random;
import java.util.Scanner;

public class CWH_20_Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter 0 for Rock.");
        System.out.println("Enter 1 for Paper.");
        System.out.print("Enter 2 for Scissor.");
        try (Scanner sc = new Scanner(System.in)) {
            Random rand = new Random();
            int num = sc.nextInt();
            int rand_num = rand.nextInt(0, 2);
            System.out.println(rand_num);
            if (num == 0 && rand_num == 0) {
                System.out.println("Tie");
            }
            if (num == 1 && rand_num == 1) {
                System.out.println("Tie");
            }
            if (num == 2 && rand_num == 2) {
                System.out.println("Tie");
            }
            if (num == 0 && rand_num == 1) {
                System.out.println("Paper wins");
            }
            if (num == 0 && rand_num == 2) {
                System.out.println("Rock wins");
            }
            if (num == 1 && rand_num == 2) {
                System.out.println("Scissor wins");
            }
            if (num == 2 && rand_num == 1) {
                System.out.println("Scissor wins");
            }
            if (num == 1 && rand_num == 0) {
                System.out.println("Paper wins");
            }
            if (num == 2 && rand_num == 0) {
                System.out.println("Rock wins");
            } else {
                System.out.println("You have given an invalid input");
            }
        }

    }
}
