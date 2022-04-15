package Array;

import java.util.Arrays;

public class Asignment7 {
    public static void main(String[] args) {
        int[] array = {12, 34, 12, 45, 67, 89};

        Arrays.sort(array);                                    //sort
        int[] temp = new int[array.length];
        int j = 0;                                            //Using temporary array
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length - 1];
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");                //last element
        }
    }


}

