package Array;

public class Asignment3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6, 7};
        int num = 6;
        boolean find = false;
        int index = 0;
        for (int i : arr) {
            if (i == num) {
                find = true;
                break;
            }
            index += 1;
        }
        if (find) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
    }
}
