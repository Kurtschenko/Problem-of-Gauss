package problemGauss;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input value for factorial: ");

        int f = sc.nextInt();

        int count = 0;

        double numsSum = 1;

        for (int i = 1; i <= f; i++) {

                count++;

            numsSum = i*numsSum;

                System.out.println(count + ") Num is " + i + ", factorial is " + numsSum);

        }

        System.out.println("------------------------\n" + " Factorial of " + f + " is " + numsSum);
    }
}

