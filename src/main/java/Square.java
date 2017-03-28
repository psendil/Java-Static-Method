/**
 * Created by psenthil on 3/28/17.
 */
public class Square {

    public static void main(String[] args) {
        int squareResult;
        squareResult = square(2);
        System.out.println("Square of the given number is: " + squareResult);
    }

    public static int square(int input){
        int result;
        result = input * input;
        return result;
    }
}
