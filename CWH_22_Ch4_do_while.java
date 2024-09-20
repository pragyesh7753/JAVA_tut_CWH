import java.util.Scanner;

public class CWH_22_Ch4_do_while {
    public static void main(String[] args) {
        // int a = 0;
        // while(a<5){
        // System.out.println(a);
        // a++;
        // }
        // int b = 0;
        // do {
        // System.out.println(b);
        // b++;
        // } while (b < 5);
        int b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int c = 1;
        do {
            System.out.println(c);
            c++;
        } while (c <= n);
    }
}
