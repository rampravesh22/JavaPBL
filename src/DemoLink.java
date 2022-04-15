import java.util.*;

public class DemoLink {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(12);
        l1.add(23);
        l1.addFirst(10);
        l1.addLast(100);
        l1.add(10);
        for (int a : l1) {
            System.out.println(a);
        }
        l1.add(3, 2000);
        System.out.println("After adding" + l1);
        l1.removeFirst();
        l1.removeFirst();
        System.out.println(l1.size());
        l1.set(2, 1111);
        int a = l1.get(0);
        System.out.println(l1);
        System.out.println("l1 = " + l1.element());
        System.out.println("l1 = " + l1.contains(2));
    }
}
