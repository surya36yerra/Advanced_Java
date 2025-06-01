package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 20, 8, 15);

       List<Integer> lEven  = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
       List<Integer> lOdd = numbers.stream().filter(x->x%2!=0).collect(Collectors.toList());

        System.out.println(lEven);
        System.out.println(lOdd);
    }
}
