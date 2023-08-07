public class SingleType4 {


    private volatile static SingleType4 obj;

    private SingleType4() {
    }


    public static SingleType4 getInstance() {

        if (obj == null) {

            synchronized (SingleType4.class) {
                if (obj == null) {
                    obj = new SingleType4();
                }
            }

        }
        return obj;
    }
}
