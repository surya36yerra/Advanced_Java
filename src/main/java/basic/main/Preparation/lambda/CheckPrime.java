package lambda;

import java.util.stream.IntStream;

public class CheckPrime {
    public static void main(String[] args) {
        int n=12;
       boolean b= IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i->n%i==0);
        System.out.println(b);
    }
}
