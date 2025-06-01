package lambda;

import java.util.function.BiFunction;

public class StringConcat {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (a, b) -> a + b;
        System.out.println(concat.apply("hello", "world"));
    }
}
