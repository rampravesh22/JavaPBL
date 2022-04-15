package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Asignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> withoutTen = new ArrayList<>();
        for (int number : numbers) {
            if (number != 10)
                withoutTen.add(number);
        }

        while (numbers.length > withoutTen.size()) {
            withoutTen.add(0);
        }
        withoutTen.forEach(x -> System.out.print(x + " "));
    }
}