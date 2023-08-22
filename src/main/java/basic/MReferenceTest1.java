package basic;

interface Sayable{
    void say();
        }

public class MReferenceTest1 {


    static void say(){
        System.out.println("say something");
    }
    public static void main(String[] args) {
        Sayable s1 = MReferenceTest1::say;
        s1.say();
    }

}
