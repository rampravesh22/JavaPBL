package FlowControl;

import java.util.Scanner;

public class FC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char var = sc.next().charAt(0);
        if (var >= 65 && var <= 90 || var >= 97 && var <= 122) {
            System.out.println("Alphabet");

        }
        else if (var >= 48 && var <= 57) {
            System.out.println("Number");
        }
        else {
            System.out.println("Special Character");
        }


    }
}
