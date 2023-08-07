import java.util.ArrayList;
import java.util.List;

interface Addable{
    int add(int a,int b);
}

public class lambda1{
    public static void main(String[] args) {

        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);
        System.out.println(ad2.add(100,200));



        List<String> list = new ArrayList<String>();
        list.add("surya");
        list.add("teja");
        list.add("yerra");



        list.forEach((a)->System.out.println(a));
    }





}  