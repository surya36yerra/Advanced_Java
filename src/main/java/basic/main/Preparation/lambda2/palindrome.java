package lambda2;

import java.util.function.Predicate;

public class palindrome {
    public static void main(String[] args) {
        String s = "malayalax";

        Predicate<String> p1 = t->{
            String reverse = new StringBuffer(t).reverse().toString();
            return s.equals(reverse);
        };

        System.out.println(p1.test(s));
    }
}
