package Habibulyn.Glava2;

/**
 * Created by Hi-Tech on 20.04.2017.
 */
public class Avarage<T extends Number> {
    T[] data;

    public Avarage(T[] data){
        this.data = data;
    }

    public double avarage(){
        double result = 0.0;
        for(T t: data){
            result+=t.doubleValue();
        }
        return result/data.length;
    }

    public static void main(String[] args) {

        Integer[] iArray = {1,2,3,4,5,6};
        Double[] dArray = {3.14, 5.6, 6.8, 9.5};
        Avarage<Integer> integerAvarage = new Avarage<>(iArray);
        Avarage<Double> doubleAvarage = new Avarage<>(dArray);
        System.out.println(integerAvarage.avarage());
        System.out.println(doubleAvarage.avarage());
    }
}
