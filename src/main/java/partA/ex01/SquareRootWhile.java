package partA.ex01;

import java.util.Scanner;

public class SquareRootWhile {
    public static String squareRoot(){
        Scanner scanner = new Scanner(System.in);
        String response = "";
        int num = -1;

        while (num <= 0) {
            System.out.println("Type a non-negative integer: ");
            num = scanner.nextInt();

            if (num > 0) {
                System.out.println("The square root of " + num + " is " + Math.sqrt(num));
            } else {
                System.out.println("Invalid number, try again.");
            }
        }

        return response;
    }
    public static void main(String args[]) {
        String outputSquareRoot = squareRoot();
        System.out.println(outputSquareRoot);

    }
}
