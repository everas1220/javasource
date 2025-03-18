package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputStreamEx {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        int data = 0;
        try {
            fis = new FileInputStream("c:/temp/file1.txt");
            fos = new FileOutputStream("c:/temp/output1.txt");
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                // System.out.println(ch);
                fos.write(ch);
            }

            byte[] b = new byte[1024];
            while (in.read(b) != -1) {

            }
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
