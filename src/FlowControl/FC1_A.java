package FlowControl;

import java.util.Scanner;

public class FC1_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num == 0) {
            System.out.println("Number is a Zero Number");
        } else {
            System.out.println("Number is negative number");
        }
    }
}
