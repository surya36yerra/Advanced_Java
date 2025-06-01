package lambda;

import java.util.function.BiFunction;

public class Sum {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(1, 2));

//        SumCalculator sumCalculator = (x,y)->x+y;
//        int result = sumCalculator.sum2(7,2);
//        System.out.println(result);
    }


    }

