package generics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class WriterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("파일에 작성할 데이터를 입력해주세요");
        System.out.println("중지하려면 q를 입력해주세요");

        String data = "";
        String result = "";
        do {
            System.out.println(">> ");
            data = sc.nextline();
            result += data;

        } while (!data.equals("q"));

        try (FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter br = new BufferedWriter(fw)) {
            br.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
