package partB.ex01;

public class DoWhileLoop1 {
    public static String doWhileLoopOne(){
        String response = "";
        int[] nums = {43, 55, 68, 91, 105};

        int i = 0;
        do {
           System.out.println(nums[i]);
           i++;
        } while (i < 5);


        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileOne = doWhileLoopOne();
        System.out.println(outputDoWhileOne);
    }
}
