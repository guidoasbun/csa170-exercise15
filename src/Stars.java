/*
 *   Guido Asbun
 *   CS A170
 *   30-September-2020
 *
 *   Exercise 13
 */

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer from 3 to 10: ");
        int num = in.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = num; j > i; j--){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
