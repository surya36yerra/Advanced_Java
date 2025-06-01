package lambda;

import java.util.Arrays;
import java.util.List;

public class MultAndSum {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        System.out.println(nums.stream().reduce(1, (a, b) -> a * b).intValue());
        System.out.println(nums.stream().reduce(1, (a, b) -> a + b).intValue());

    }
}
