package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Asignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] numbers = {1, 0, 1, 0, 0, 1, 1};
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> evenOdd = new ArrayList<>();
        Arrays.stream(numbers).forEach(num -> {
            if (num % 2 == 0)
                evenOdd.add(num);
        });
        Arrays.stream(numbers).forEach(num -> {
            if (num % 2 != 0)
                evenOdd.add(num);
        });

        evenOdd.forEach(num -> System.out.print(num + " "));
    }
}