package partA.ex02;

import java.util.Scanner;

public class SumOfNums {
    public static String sum(){
        Scanner scanner = new Scanner(System.in);
        String response = "";
        int count = 0;
        int num = 0;

        while (count < 10) {
            System.out.println("Enter number below: ");
            num += scanner.nextInt();
            count++;
        }
        response += "Total sum of 10 numbers is " + num;

        return response;
    }
    public static void main(String args[]) {
        String outputSum = sum();
        System.out.println(outputSum);
    }
}
