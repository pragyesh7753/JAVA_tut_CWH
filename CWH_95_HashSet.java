
import java.util.HashSet;

public class CWH_95_HashSet {
    public static void main(String[] args) {
        // HashSet<Integer> myHashSet = new HashSet<>();
        HashSet<Integer> myHashSet = new HashSet<>(6, .5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
    }
}
