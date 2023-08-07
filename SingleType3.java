public class SingleType3 {


    private static SingleType3 obj;

    private SingleType3(){}


    public static SingleType3 getInstance(){

        if (obj == null) {

        synchronized(SingleType3.class)
        {
                obj=  new SingleType3();
            }
        }

        return obj;
    }
}
