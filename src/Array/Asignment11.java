package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Asignment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;
        for (int num : numbers) {
            if (num != 1 && num != 4) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}