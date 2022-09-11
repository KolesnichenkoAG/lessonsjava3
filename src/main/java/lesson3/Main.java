package lesson3;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
//        File dir = new File("dirs");
       /* File file = new File("dirs/123somefile.txt");
        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        /*File file = new File("dirs/somefile.txt");
        file.renameTo(new File ("dirs/155.txt"));*/
      /*  InputStream inputStream = new FileInputStream("dirs/155.txt");

        InputStream url = new URL("http://google.com").openStream();

        InputStream array = new ByteArrayInputStream(new byte[]{90, 52, 73, 75, 81, 90});

        byte[] buffer = new byte[5];
        while (true) {
            int read = inputStream.read(buffer);

            if (read != -1) {
                System.out.println("read = " + read
                + "     buffer = " + Arrays.toString(buffer)
                + "     str = " + new String(buffer, 0, read, StandardCharsets.UTF_8));
            } else break;
        }*/


        /*RandomAccessFile randomAccessFile = new RandomAccessFile("dirs/155.txt", "rw");
        randomAccessFile.seek(23);
        System.out.println((char) randomAccessFile.read());*/

        ArrayList<InputStream> inputStreamArrayList = new ArrayList<>();
        inputStreamArrayList.add(new FileInputStream("dirs/155.txt"));
        inputStreamArrayList.add(new FileInputStream("dirs/123somefile.txt"));

        SequenceInputStream sequenceInputStream = new SequenceInputStream(Collections.enumeration(inputStreamArrayList));
        int x;

        while ((x = sequenceInputStream.read()) != -1) {
            System.out.print((char) x);
        }

        sequenceInputStream.close();

    }
}
