package partB.ex02;

import java.util.Scanner;

public class WhileLoop2 {
    public static String whileLoopTwo(){
        Scanner scanner = new Scanner(System.in);
        String response = "";

        System.out.println("Please enter a number to count to: ");
        int stop = scanner.nextInt();
        int i = 0;

        while (i != stop) {
            response += "\nThe Current Number is: " + i;
            i++;
        }

        response += "\nWe are done";
        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopTwo = whileLoopTwo();
        System.out.println(outputWhileLoopTwo);

    }
}
