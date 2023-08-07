public class SingleType1 {


    private static SingleType1 obj;

    private SingleType1() {
    }


    public static SingleType1 getInstance() {
        if (obj == null)

            obj = new SingleType1();
        return obj;

    }
}
