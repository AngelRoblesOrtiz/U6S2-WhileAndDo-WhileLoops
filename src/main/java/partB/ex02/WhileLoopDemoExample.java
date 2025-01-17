package partB.ex02;

public class WhileLoopDemoExample { //creates the parent class

    public static String whileLoop(){ //creates the whileLoop method class
        String response = ""; //creates empty response string

        int num = 0; //creates int num
        response += ("Let's count to 10!"); //gives a value to response
        while(num < 10){ //while num is larger than 10
            num = num + 1; //add 1 to num
            response += ("\nNumber: " + num); //add on the num to response
        } //close the while loop
        response += ("\nWe have counted to 10! Hurrah!"); //finish off the response

        return response; //return response

    } //close whileLoop method class
    public static void main(String[] args) { //creates main class
        String outputWhileLoop = whileLoop(); //sets string equal to output
        System.out.println(outputWhileLoop); //prints string
    } //closes main class


} //closes parent class
