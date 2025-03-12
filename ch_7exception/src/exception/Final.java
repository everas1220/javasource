package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Final {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

        // try - with -resources
        try (FileInputStream fis2 = new FileInputStream("file.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
