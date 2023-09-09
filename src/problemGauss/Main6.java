package problemGauss;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input value for calculating of sum: ");

        int f = sc.nextInt();

        int count = 0;

        double numsSum = 1;

        for (int i = 1; i <= f; i++) {

                count++;

            numsSum+=i;

                System.out.println(count + ") Num is " + i + ", sum is " + numsSum);

        }

        System.out.println("------------------------\n" + " The sum of " + f + " is " + numsSum);
    }
}

