public class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);

    }

    public static double powerDouble(double num1, double num2) {
        return Math.pow(num1, num2);


    }

    public static void main(String[] args) {
        System.out.println(powerInt(1, 3));
        System.out.println(powerDouble(11, 12));
        System.out.println();

    }


}
