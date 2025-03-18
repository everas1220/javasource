package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputStreamEx2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        int data = 0;
        byte b[] = new byte[1024];
        try {
            fis = new FileInputStream("c:/temp/ing1.jpg");
            fos = new FileOutputStream("c:/temp/output1.jpg ");
            long start = System.currentTimeMillis();
            while ((data = fis.read(b)) != -1) {
                char ch = (char) data;
                // System.out.println(ch);
                fos.write(b);
            }
            long end = System.currentTimeMillis();
            System.out.println("복사하는데 걸린시간 : " + (end - start) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
