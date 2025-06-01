package lambda2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongString {
    public static void main(String[] args) {
        List< String > colors = Arrays.asList("Red", "Green", "Blue", "Orange", "Black");
        System.out.println(colors.stream().max(Comparator.comparingInt(String::length)));
        System.out.println(colors.stream().min(Comparator.comparingInt(String::length)));

    }
}
