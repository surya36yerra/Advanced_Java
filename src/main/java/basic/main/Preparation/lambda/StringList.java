package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Red", "Green", "Blue", "PINK");
        list.forEach(String::toUpperCase);
        System.out.println(list);
    }
}
