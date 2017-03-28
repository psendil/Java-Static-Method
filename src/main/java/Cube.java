/**
 * Created by psenthil on 3/28/17.
 */
public class Cube {
    public static void main(String[] args) {
        int cubeofSeven;

        cubeofSeven = cube(7);
        outputMessage();
        System.out.println(cubeofSeven);
    }

    public static void outputMessage() {
        System.out.println("Cube of given number is: ");
    }
    public static int cube(int parameter) {
        int result;
        result = parameter * parameter * parameter;
        return result;
    }
}
