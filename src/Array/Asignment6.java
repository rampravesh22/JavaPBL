package Array;

public class Asignment6 {
    public static void main(String[] args) {
        int[] arr = {67, 78, 89, 67, 23};

        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;


        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}