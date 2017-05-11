package Habibulyn.Glava1;

/**
 * Created by Hi-Tech on 19.04.2017.
 */

final class Singleton{
    private static Singleton s = new Singleton(0);
    private int k;
    private Singleton(int i){
        k=i;
    }

    public static Singleton  getReference(){
        return s;
    }

    public int getValue(){
        return k;
    }

    public void setValue(int k){
        this.k=k;
    }
}
public class SingletonTest {
    public static void main(String[] args) {
        Singleton ref = Singleton.getReference();
        System.out.println(ref.getValue());
        ref.setValue(ref.getValue()+5);
        System.out.println(ref.getValue());
    }
}
