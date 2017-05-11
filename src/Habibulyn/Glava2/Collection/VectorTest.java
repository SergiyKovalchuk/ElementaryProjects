package Habibulyn.Glava2.Collection;

import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Created by Hi-Tech on 24.04.2017.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        String s = "Строка яку ми хочемо розібрати на слова";
        StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");
        while (st.hasMoreTokens()){
            v.add(st.nextToken());
        }

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.setSize(4);
        v.add("зібрати");
        v.set(3, "знову");
        for(int i=0; i<v.size(); i++)
            System.out.print(v.get(i) + " ");
        System.out.println();

        for(String s1 : v)
            System.out.print(s1 + " ");
        System.out.println();
    }
}
