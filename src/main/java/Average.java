/**
 * Created by psenthil on 3/28/17.
 */
public class Average {


    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40};
        double average = findAverage(array);
        System.out.printf("Average of given number is : "+ average);
    }

    public static double findAverage(int[] a){
        double result;
        int sum = 0;
        for (int i = 0;i < a.length; i++){
            sum += a[i];
        }

        result = sum / a.length;
        return result;
    }
}
