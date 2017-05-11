package Glava16;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Hi-Tech on 11.04.2017.
 */
public class UsingRandomAccessFile {
    static void display() throws IOException{
        RandomAccessFile rf = new RandomAccessFile("rtest.txt","r");
        for(int i=0; i<7; i++)
            System.out.println("Значення " + i + " " + rf.readDouble());
        System.out.println(rf.readUTF());
        rf.close();
    }

    public static void main(String[] args) throws IOException{
        RandomAccessFile rf = new RandomAccessFile("rtest.txt","rw");
        for(int i=0; i<7; i++)
            rf.writeDouble(i*1.414);
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf=new RandomAccessFile("rtest.txt","rw");
        rf.seek(5*8);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }
}
