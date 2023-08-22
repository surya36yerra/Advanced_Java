package basic;

public class SingleType2 {


    private static SingleType2 obj = new SingleType2();

    private SingleType2(){}


    public static SingleType2 getInstance(){
        return obj;
    }
}
