

// interface Runnable{
//    public void run();
// }

  public class RunnableTest1        {

 public static void main(String[]args) {

     Runnable r1 = () -> {
         System.out.println("starting tthread 1");
     };

     Thread t2 = new Thread(r1);
     t2.start();



     Thread t3 = new Thread(RunnableTest1::run);
     t3.start();

 }

      private static void run(){
          System.out.println("Thread is running...");
      }
  }