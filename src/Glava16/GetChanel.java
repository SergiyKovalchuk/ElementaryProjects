package Glava16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Hi-Tech on 12.04.2017.
 */
public class GetChanel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        FileChannel fc = new FileOutputStream("data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();
        // Добавлення в кінець файлу
        fc = new RandomAccessFile("data.txt","rw").getChannel();
        fc.position(fc.size());//переходим в кінець
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();
        // Читання файлу
        fc = new FileInputStream("data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining())
            System.out.print((char)buff.get());

    }
}
