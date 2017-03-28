/**
 * Created by psenthil on 3/28/17.
 */
public class Half {

    public static void main(String[] args) {
        int halfOfDigit;
        halfOfDigit = half(8);
        System.out.println("Half of given digit is: " + halfOfDigit);

    }

    public static int half(int parameter){
        int result;

        result = parameter/2;

        return result;
    }
}
