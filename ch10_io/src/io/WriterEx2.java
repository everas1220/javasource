package generics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class WriterEx2 {
    public static void main(String[] args) {

        System.out.println("파일에 작성할 데이터를 입력해주세요");
        System.out.println("중지하려면 q를 입력해주세요");

        try (Scanner scanner = new Scanner(System.in);
                FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter br = new BufferedWriter(fw)) {

            String data = "";

            do {
                System.out.println(">> ");
                data = sc.nextline();

                if (!data.equals("q")) {
                    br.write(data);
                    br.newLine();
                }

            } while (!data.equals("q"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
