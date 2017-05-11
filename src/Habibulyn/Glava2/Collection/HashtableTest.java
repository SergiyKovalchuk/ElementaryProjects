package Habibulyn.Glava2.Collection;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Hi-Tech on 24.04.2017.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<String, String> yp = new Hashtable<>();
        String name = null;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        yp.put("Jon", "123-64-56");
        yp.put("Steve", "12-23-5454");
        yp.put("Bill", "340-545-89");
        yp.put("Jon", "123-64-56");
        yp.put("Jonatan", "123-64-56");

        if(yp.containsKey(name))
            System.out.println(name + "'s phone -" + yp.get(name));
        else
            System.out.println("Sorry, no such name");
    }
}
