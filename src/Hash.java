import java.util.*;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(12);
        hash.add(13);
        hash.add(23);
        hash.add(18);
        hash.add(18);
        List<Integer> l = new ArrayList<>(hash);
        l.sort(Comparator.reverseOrder());
        l.sort(Collections.reverseOrder());
        System.out.println(l);


    }
}
