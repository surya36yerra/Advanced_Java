import java.util.StringJoiner;

public class StriingJoiner1 {

    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        StringJoiner sj2 = new StringJoiner(",","{","}");


        sj2.add("surya");
        sj2.add("yerra");
        sj2.add("phoenix");
        sj2.add("tatum");

        System.out.println(sj);

        System.out.println(sj2);

    }
}
