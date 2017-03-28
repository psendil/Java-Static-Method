/**
 * Created by psenthil on 3/28/17.
 */
public class AvgArray {

    public static void main(String[] args) {

        int[] array = {100,200,300,400};
        double average = averageOf(array);
        System.out.println("Average of given number is : "+average);
    }


    public static double averageOf(int[] parameter) {
        double result;
        int sum = 0;

        for (int j=0; j< parameter.length;j++) {
            sum += parameter[j];
        }

        result = (double) sum / parameter.length;
        return result;
    }
}
