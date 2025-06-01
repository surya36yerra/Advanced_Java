package lambda;

import java.util.Arrays;
import java.util.List;

public class DoubleAverage {
    public static void main(String[] args) {
        List<Double> nums = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);

        nums.stream().mapToDouble(Double::doubleValue).average().ifPresent(System.out::println);
    }
}
