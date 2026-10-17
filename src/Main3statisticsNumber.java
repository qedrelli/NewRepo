
import java.util.Scanner;

public class Main3statisticsNumber {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int even = 0;
        int odd = 0;

        System.out.print("Enter number 1: ");
        int x1 = number.nextInt();

        System.out.print("Enter number 2: ");
        int x2 = number.nextInt();

        System.out.print("Enter number 3: ");
        int x3 = number.nextInt();

        System.out.print("Enter number 4: ");
        int x4 = number.nextInt();

        System.out.print("Enter number 5: ");
        int x5 = number.nextInt();

        System.out.print("Enter number 6: ");
        int x6 = number.nextInt();

        System.out.print("Enter number 7: ");
        int x7 = number.nextInt();

        System.out.print("Enter number 8: ");
        int x8 = number.nextInt();

        System.out.print("Enter number 9: ");
        int x9 = number.nextInt();

        System.out.print("Enter number 10: ");
        int x10 = number.nextInt();

        if (x1 > 0)
            positive++;
        if (x2 > 0)
            positive++;
        if (x3 > 0)
            positive++;
        if (x4 > 0)
            positive++;
        if (x5 > 0)
            positive++;
        if (x6 > 0)
            positive++;
        if (x7 > 0)
            positive++;
        if (x8 > 0)
            positive++;
        if (x9 > 0)
            positive++;
        if (x10 > 0)
            positive++;

        if (x1 < 0)
            negative++;
        if (x2 < 0)
            negative++;
        if (x3 < 0)
            negative++;
        if (x4 < 0)
            negative++;
        if (x5 < 0)
            negative++;
        if (x6 < 0)
            negative++;
        if (x7 < 0)
            negative++;
        if (x8 < 0)
            negative++;
        if (x9 < 0)
            negative++;
        if (x10 < 0)
            negative++;

        if (x1 == 0)
            zeros++;
        if (x2 == 0)
            zeros++;
        if (x3 == 0)
            zeros++;
        if (x4 == 0)
            zeros++;
        if (x5 == 0)
            zeros++;
        if (x6 == 0)
            zeros++;
        if (x7 == 0)
            zeros++;
        if (x8 == 0)
            zeros++;
        if (x9 == 0)
            zeros++;
        if (x10 == 0)
            zeros++;

        if (x1 % 2 == 0 && x1 != 0)
            even++;
        if (x2 % 2 == 0 && x2 != 0)
            even++;
        if (x3 % 2 == 0 && x3 != 0)
            even++;
        if (x4 % 2 == 0 && x4 != 0)
            even++;
        if (x5 % 2 == 0 && x5 != 0)
            even++;
        if (x6 % 2 == 0 && x6 != 0)
            even++;
        if (x7 % 2 == 0 && x7 != 0)
            even++;
        if (x8 % 2 == 0 && x8 != 0)
            even++;
        if (x9 % 2 == 0 && x9 != 0)
            even++;
        if (x10 % 2 == 0 && x10 != 0)
            even++;

        if (x1 % 2 == 1 || x1 % 2 == -1)
        odd++;
        if (x2 % 2 == 1 || x2 % 2 == -1)
        odd++;
        if (x3 % 2 == 1 || x3 % 2 == -1)
        odd++;
        if (x4 % 2 == 1 || x4 % 2 == -1)
        odd++;
        if (x5 % 2 == 1 ||  x5 % 2 == -1)
        odd++;
        if (x6 % 2 == 1 || x6 % 2 == -1)
        odd++;
        if (x7 % 2 == 1 || x7 % 2 == -1)
        odd++;
        if (x8 % 2 == 1 || x8 % 2 == -1)
        odd++;
        if (x9 % 2 == 1 || x9 % 2 == -1)
        odd++;
        if (x10 % 2 == 1 || x10 % 2 == -1)
        odd++;

        System.out.println("=====STATISTICS=====\nPositive numbers: " + positive + "\nNegative numbers: " + negative + "\nZeros: " + zeros + "\nEven numbers: " + even + "\nOdd numbers: " + odd);


    }
}