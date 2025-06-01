package lambda2;
import java.util.Arrays;
import java.util.List;

public class AvgStringLength {
    public static void main(String[] args) {

        List <String> colors = Arrays.asList("Red", "Black", "White", "Orange", "Blue");

        colors.stream().mapToInt(String::length).average().ifPresent(System.out::println);

    }
}
