package FlowControl;

import java.util.Scanner;

public class FC8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter color code :");
        char color = scan.next().charAt(0);

        switch (color) {
            case 'R', 'r' -> System.out.println("Red");
            case 'B', 'b' -> System.out.println("Blue");
            case 'G', 'g' -> System.out.println("Green");
            case 'O', 'o' -> System.out.println("Orange");
            case 'Y', 'y' -> System.out.println("Yellow");
            case 'W', 'w' -> System.out.println("White");
            default -> System.out.println("Invalid Code");
        }
    }
}
