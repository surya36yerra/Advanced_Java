package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 3, 4, 3, 2, 5, 6, 1, 7, 7, 8, 10);
        Optional<Integer> opt = nums.stream().max(Integer::compareTo);
        System.out.println(opt);

        Optional<Integer> opt2 = nums.stream().min(Integer::compareTo);
        System.out.println(opt2);
    }
}
