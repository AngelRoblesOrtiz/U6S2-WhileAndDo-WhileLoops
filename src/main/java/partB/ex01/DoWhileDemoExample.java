package partB.ex01;

public class DoWhileDemoExample { //creates the parent class
    public static String doWhile(){ //creates the doWhile method class
        String response = ""; //creates empty response string

        int i = 1; //creates int i
        do { //do this
            if (i % 2 == 1) //if i modulo 2 leaves a remainder of 1
                response += (" " + i); //response equals i
            i++; //increase i by 1
        }while(i < 21); //while i is less than 21

        return response; //return response
    } //closes the doWhile method class

    public static void main(String[] args) { //creates main class
        String outputDoWhile = doWhile(); //creates string of doWhile
        System.out.println(outputDoWhile); //prints string
    } //closes main class
} //closes parent class
