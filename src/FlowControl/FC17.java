package FlowControl;

import java.util.Scanner;

public class FC17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long original = num;
        long reverse = 0;
        while (num != 0) {
            long rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;


        }

        if (reverse == original) {
            System.out.println("It is an palindrome number");

        } else {
            System.out.println("It is not a palindrome number");
        }


    }

}
