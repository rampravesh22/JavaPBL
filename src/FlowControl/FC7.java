package FlowControl;

import java.util.Scanner;

public class FC7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char v = sc.next().charAt(0);
        if (v >= 65 && v < 90) {
            System.out.println((char) (v + 32));
        } else {
            System.out.println((char)(v - 32));
        }
    }

}
