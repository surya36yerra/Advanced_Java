package newFeatures;

@FunctionalInterface
public interface FuncInterf1 {

     public static final String name = "test";

     void test2();

     static void test(){
//         System.out.println("static method");

     }

    default void test1(){
//        System.out.println("default method");
    }

    private void test3(){
//        System.out.println();
    }
}
