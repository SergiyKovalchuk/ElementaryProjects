package Glava16;

import java.io.*;

/**
 * Created by Hi-Tech on 11.04.2017.
 */
public class BasicFileOutput {
    static String file = "BasicFileOutput out\n" + "new";

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new StringReader(file));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("new2.txt")));
        int lineCount = 1;
        String s;
        while ((s=in.readLine()) != null)
            out.println(lineCount++ + " " + s);
        out.close();
        System.out.println(BufferedInputFile.read("new2.txt"));
    }
}
