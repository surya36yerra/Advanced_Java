package lambda;

import java.util.stream.LongStream;

public class FactorialLambda {
    public static void main(String[] args) {
        int number = 11;
        long fact = findFactorial(number);
        System.out.println(fact);
    }

    static long findFactorial(int n){
        if(n<1){
            System.out.println("invalid number");
        }

            return LongStream.rangeClosed(1,n).reduce(1L,(a,b) -> a*b);

    }
}
