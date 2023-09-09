package problemGauss;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        int numsSum = 0;

        for (int i = 1; i <= 41; i++) {

            count++;

            numsSum+=i;

            System.out.println(count + ") Num is " + i + ", sum is " + numsSum);
        }

        System.out.println("------------------------\n" + " Sum of numbers is " + numsSum);

    }

}