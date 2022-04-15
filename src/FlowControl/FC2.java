package FlowControl;

import java.util.Scanner;

public class FC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is a even number");
        } else {
            System.out.println("Number is a odd number ");
        }
    }

}
