package FlowControl;

import java.util.Scanner;

public class FC12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (num == 1) {
            System.out.println("It is not a prime number");
        } else {
            if (prime) {
                System.out.println("Input number is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }

        }
    }
}
