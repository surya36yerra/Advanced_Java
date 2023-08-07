public class ThreadTest2 implements Runnable{


    public static void main(String[] args) {

        ThreadTest2 tt2 = new ThreadTest2();
    //    tt2.start();
        tt2.run();

        Thread t2 = new Thread(tt2);
        t2.start();
        t2.run();
       


        System.out.println("current thread is "+Thread.currentThread().getThreadGroup() + "," +

                Thread.currentThread().getId() + "," +
                Thread.currentThread().getName()+" ," +
                Thread.currentThread().getState() + "," +
                Thread.currentThread().getPriority());








    }


    @Override
    public void run() {
        System.out.println("impleementing my own runnable");
    }
}
