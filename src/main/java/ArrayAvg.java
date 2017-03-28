/**
 * Created by psenthil on 3/28/17.
 */
public class ArrayAvg {
    public static void main(String[] args) {

        int[] array = {1,2,3,4};
        double average = findAverage(array);
        System.out.println("The average of given array numbers are : "+ average);
    }

    public static double findAverage (int[] a){
        double result;
        int sum = 0;

        for (int i =0; i < a.length; i++){
            sum += a[i];
        }
        result = (double) sum / a.length;
        return result;
    }
}
