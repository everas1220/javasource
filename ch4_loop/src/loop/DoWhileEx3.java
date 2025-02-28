package loop;

import java.util.Scanner;

public class DoWhileEx3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("메세지를 입력하세요");

        String input;
        // 문자 입력받은후 출력
        // q 를 입력받으면 반복문 종료

        do {

            System.out.println("종료를 원하시면 q,또는 Q를 눌러주세요");
            System.out.print(">>");
            input = scanner.nextLine();
            System.out.println(input);

        } while (!input.equalsIgnoreCase("q")); // ==, != -> equals,

        System.out.println("프로그램을 종료합니다.");
    }
}
