package lambda;

import java.util.Arrays;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Blue", "PINK");

       list.sort((s1,s2)->s1.compareToIgnoreCase(s2));
       System.out.println(list);
    }
}
