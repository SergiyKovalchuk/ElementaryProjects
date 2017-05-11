package Habibulyn.IO;

import java.io.*;

/**
 * Created by Hi-Tech on 07.05.2017.
 */
public class PrWr {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "Cp866"),true);

            String s = "Це рядок з текстом";
            System.out.println("System.out puts: " + s);

            pw.println("PrintWriter puts: " + s);
            int c = 0;

            pw.println("Посимвольний вивід: ");

            while ((c = br.read()) != -1)
                pw.println((char)c);

            pw.println("Порядковий вивід: ");
            do{
                br.readLine();
                pw.println(s);
            } while (!s.equals("q"));
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
