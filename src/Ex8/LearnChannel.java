package Ex8;

import com.sun.org.apache.bcel.internal.generic.Select;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.*;

/**
 * Created by Administrator on 2017/2/10.
 */
public class LearnChannel {
    public static void main(String[] args) throws IOException {
        Selector select = Selector.open();
//        int a = 2;
//        System.out.println(a >> 1);
//        RandomAccessFile file = new RandomAccessFile("D:\\oacontroller.txt", "rw");
//        FileChannel inChannel = file.getChannel();
//        long count = inChannel.size();
//        RandomAccessFile file2 = new RandomAccessFile("D:\\oacontroller2.txt", "rw");
//        FileChannel outChannel = file2.getChannel();
//        outChannel.transferFrom(inChannel, 0l, count);
//        ByteBuffer buf = ByteBuffer.allocate(48);
//        int bytesRead = inChannel.read(buf);
//        while (bytesRead != -1) {
//            System.out.println("Read " + bytesRead);
//            buf.flip();
//            while (buf.hasRemaining()) {
//                System.out.print((char)buf.get());
//            }
//            buf.clear();
//            bytesRead = inChannel.read(buf);
//        }
//        file.close();
    }
}
