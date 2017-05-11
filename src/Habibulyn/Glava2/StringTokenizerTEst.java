package Habibulyn.Glava2;

import java.util.StringTokenizer;

/**
 * Created by Hi-Tech on 21.04.2017.
 */
public class StringTokenizerTEst {
    public static void main(String[] args) {
        String s = "Строка, которую ми хотим разобрать на слова";
        StringTokenizer st = new StringTokenizer(s, " \t\r\n,.");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
