package FlowControl;

import java.util.Scanner;

public class FC16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long reverse = 0;
        while (num != 0) {
            long rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;


        }

        System.out.println(reverse);
    }

}
