public class SingleType5 {


    private static SingleType5 obj;

    private SingleType5(){}


    public static synchronized SingleType5 getInstance(){

        if (obj == null) {


                obj=  new SingleType5();
            }


        return obj;
    }
}
