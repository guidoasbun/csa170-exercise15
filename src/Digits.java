/*
 *   Guido Asbun
 *   CS A170
 *   30-September-2020
 *
 *   Exercise 13
 */
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter an integer: ");
        int num = in.nextInt();

        System.out.print("Number reversed: ");
        while (num > 0){
            int digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num = num / 10;
        }
        System.out.println();
        System.out.println("Sum of digits: " + sum);
    }
}
