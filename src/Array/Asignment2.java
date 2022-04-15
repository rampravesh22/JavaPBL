package Array;

public class Asignment2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6};
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);

        int min = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println(min);


    }
}
