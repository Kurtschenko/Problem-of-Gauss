package problemGauss;
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input value for number of Fibonacci: ");

        int f = sc.nextInt();

        int a = 1;
        int b = 1;
        int c = 0;

        System.out.println(c + "\n" + a + "\n" + b);

        while (c < f) {

            c = a + b;

            System.out.println(c);

            a = c;

            c = b + a;

            System.out.println(c);

            b = c;

            c = a + b;

        }
    }
}
