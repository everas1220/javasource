package exception;

import java.util.Scanner;

public class NumberformatEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 >>");

        try {
            int num = Integer.parseInt(sc.nextLine());
            System.out.println(num);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("문자를 입력했는지 확인해주세요");
        }
        sc.close();
    }
}
