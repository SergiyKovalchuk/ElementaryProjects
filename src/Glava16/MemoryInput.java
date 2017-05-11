package Glava16;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Hi-Tech on 11.04.2017.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("new.txt"));
        int c;
        while((c=in.read()) != -1)
            System.out.println((char)c);
    }
}
