package FlowControl;

import java.util.Scanner;

public class FC1_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        int l1 = a % 10;
        int l2 = b % 10;

        if (l1 == l2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
