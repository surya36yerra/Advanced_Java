package lambda2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        Integer[] nums = {1, 7, 18, 25, 77, 300, 101};

        List<Integer> list = Arrays.asList(nums);
        System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null));
        System.out.println(list.stream().distinct().sorted().skip(1).findFirst().orElse(null));


    }
}
