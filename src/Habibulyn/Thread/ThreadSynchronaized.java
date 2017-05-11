package Habibulyn.Thread;

/**
 * Created by Hi-Tech on 06.05.2017.
 */
public class ThreadSynchronaized implements Runnable {
    @Override
    synchronized public void run() {

            System.out.print("Hello ");

            try{
               Thread.sleep(1000);
            } catch (InterruptedException ex){

            }
            System.out.println("World");

    }

    public static void main(String[] args) {
        ThreadSynchronaized th = new ThreadSynchronaized();
        new Thread(th).start();
        new Thread(th).start();
    }
}
