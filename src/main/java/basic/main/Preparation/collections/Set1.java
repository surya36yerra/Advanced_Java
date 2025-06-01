package collections;

import java.util.*;

//For fast access and no order requirement: HashSet
//        For maintaining insertion order: LinkedHashSet
//        For sorted elements: TreeSet
//        For enum values: EnumSet
//        For thread-safe operations: CopyOnWriteArraySet

public class Set1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();
        Set<String> set3 = new TreeSet<>();
       // Set<String> set4 = new EnumSet<>();

        set3.add("x");
        set3.add("y");
        set3.add("b");
        set3.add("c");

        Iterator<String> iterator = set3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }








//




    }
}
