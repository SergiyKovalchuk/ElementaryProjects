package Habibulyn.Exception;

/**
 * Created by Hi-Tech on 05.05.2017.
 */

class ChipherException extends Exception{
    private String msg;
    ChipherException(){
        msg = null;
    }

    ChipherException(String msg){
        msg = null;
    }

    @Override
    public String toString() {
        return " ChipherException (" + msg + ")";
    }
}

public class ExceptDemo {

    public static void handle (int chiper) throws ChipherException{
        System.out.println("handle()'s beginning");
        if(chiper < 0 || chiper > 9){
            throw new ChipherException("" + chiper);
        }
        System.out.println("handle()'s ending");
    }
    public static void main(String[] args) {
       try{
           handle(1);
           handle(10);
       } catch (ChipherException ce){
           System.out.println("caught " + ce);
           ce.printStackTrace();
       }

    }
}
