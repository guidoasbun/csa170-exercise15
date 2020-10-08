import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;

        System.out.println("Enter an integer: ");
        int firstNum = in.nextInt();

        System.out.println("Enter another integer larger than the first one:");
        int secondNum = in.nextInt();

        System.out.print("Even numbers: ");
        for (int i = firstNum; i <= secondNum; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
                sumEven += i;
            }
        }
        System.out.println(" ");
        System.out.println("Sum of even numbers = " + sumEven);

        System.out.print("Odd numbers: ");
        for (int i = firstNum; i <= secondNum; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
                sumOdd += i;
            }
        }
        System.out.println(" ");
        System.out.println("Sum of odd numbers = " + sumOdd);
    }
}
