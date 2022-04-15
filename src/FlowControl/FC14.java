package FlowControl;

import java.util.Scanner;

public class FC14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long original = num;
        long sum = 0;
        while (num != 0) {
            long rem = num % 10;
            sum = sum + rem;
            num = num / 10;


        }

        System.out.println(sum);

    }
}
