package collections;

import java.util.ArrayList;
import java.util.List;

class List1 {

    public static void main(String[] args) {

        List<String> list2 = new ArrayList<String>();
        list2.add("GHI");

        List<String> list = new ArrayList<String>();
        list.addAll( list2);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add(0,"E");
        list.addAll(1, list2);

        for(String s : list) {
            System.out.println(s);

        }

    }
}