public class ThreadTest1 extends Thread{


    public static void main(String[] args) {

        ThreadTest1 tt1 = new ThreadTest1();
        tt1.start();
        tt1.run();

        Thread t1 = new Thread(tt1);
        t1.start();


        t1.run();


        System.out.println("current thread is "+Thread.currentThread().getThreadGroup() + "," +

                Thread.currentThread().getId() + "," +
                Thread.currentThread().getName()+" ," +
                Thread.currentThread().getState() + "," +

                Thread.currentThread().getPriority());








    }



}
