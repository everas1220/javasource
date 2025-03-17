package generics;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class inputStreamEx1 {
    public static void main(String[] args) {

        InputStream in = System.in;
        OutputStream out = System.out;

        try {
            // 한바이트만 읽은후 int로 출력(영어,숫자만 가능, 한글 불가능)
            // int inptu = in.read();
            // out.write(input);
            // int input = 0;
            // while ((input = in.read()) != -1) {
            // out.write(input);
            // }

            byte[] b = new byte[1024];
            while ((in.read(b)) != -1) {
                out.write(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
