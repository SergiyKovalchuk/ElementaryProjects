package Habibulyn.Glava2;

/**
 * Created by Hi-Tech on 20.04.2017.
 */
class MyGenericClass<T>{
    private T data;

    public MyGenericClass(){}

    public MyGenericClass(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }
}

public class MyGenericClassDemo {
    public static void main(String[] args) {
        MyGenericClass<Integer> iMyGEn = new MyGenericClass<>(55);
        System.out.println(iMyGEn.getData());
        iMyGEn.setData(100);
        System.out.println(iMyGEn.getData());
        MyGenericClass<Double> dMyGEn = new MyGenericClass<>(-33.456);
        System.out.println(dMyGEn.getData());
        dMyGEn.setData(3.14);
        System.out.println(dMyGEn.getData());
        MyGenericClass<String> sMyGEn = new MyGenericClass<>("Hello");
        System.out.println(sMyGEn.getData());
        sMyGEn.setData("Good bye");
        System.out.println(sMyGEn.getData());

    }
}
