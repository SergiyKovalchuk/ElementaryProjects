package Habibulyn.Glava1;

/**
 * Created by Hi-Tech on 18.04.2017.
 */

enum Lightsnew {RED, YELLOW, GREEN, ERROR}

public class EnumMethods {
    public static void main(String[] args) {
        for(Lights lights: Lights.values()){
            System.out.println("Тип: " + lights.getDeclaringClass());
            System.out.println("Числове значення: " + lights.ordinal());
        }
    }
}
