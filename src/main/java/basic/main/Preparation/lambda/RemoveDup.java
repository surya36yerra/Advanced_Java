package lambda;

import java.util.Arrays;
import java.util.List;

public class RemoveDup {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        nums.stream().distinct().forEach(System.out::println);
    }
}
