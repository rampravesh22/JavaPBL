package Array;

public class Asignment1 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {                                        //sum
            sum = sum + array[i];
        }
        System.out.println("The sum of the array is: " + sum);
        double avg = (float) (sum / array.length);                                            //average
        System.out.println("The average of the array is: " + avg);
    }
}
