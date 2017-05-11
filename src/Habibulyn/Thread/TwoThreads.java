package Habibulyn.Thread;

/**
 * Created by Hi-Tech on 05.05.2017.
 */
class OutThread extends Thread{
    private String msg;

    OutThread(String msg, String name){
        super(name);
        this.msg = msg;
    }

    public void run(){
        for(int i = 0; i < 20; i++){
            try{
                Thread.sleep(100);
            } catch (InterruptedException ie) {

            }
            System.out.print(msg + " ");
        }
        System.out.println("End of " + getName());
    }
}

public class TwoThreads {
    public static void main(String[] args) {
        new OutThread("HIP", "Thread1").start();
        new OutThread("hop", "Thread2").start();
        System.out.println();
    }
}
