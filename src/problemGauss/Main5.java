package problemGauss;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input value for factorial: ");

        int f = sc.nextInt();

        int count = 0;

        double numsSum = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input value for stepin: ");

        double s = scanner.nextDouble();

        double q1 = Math.pow(f, s);

        if (f < 171) {

            for (int i = 1; i <= f; i++) {

                count++;

                numsSum = i * numsSum;

            System.out.println(count + ") Num is " + i + ", factorial is " + numsSum);

            }
            System.out.println("------------------------\n" + " Factorial of " + f + " is " + numsSum);

            System.out.println("------------------------\n " + f + " raised to the power " + s + " is " + q1);

        } else {

                double q = Math.pow(f, 15);

                double A = q*1000000;

            System.out.println("------------------------\n" + " Factorial of " + f+ " is: " + f +"*(" + q + "+1)" +"*" + A);

            System.out.println("------------------------\n " + f + " raised to the power " + s + " is " + q1);

            }
        }

}
