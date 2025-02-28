package loop;

import java.util.Scanner;

public class DoWhileEx2 {
    public static void main(String[] args) {
        // 컴퓨터가 1~100 사이의 임의의 수를 생성/ 생성된 숫자를 맞추기
        Scanner scanner = new Scanner(System.in); // new Scanner(System.in) 키보드 입력
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // 사용자 답변 저장

        // 1~100사이의 정수를 입력받아서 컴퓨터에서 숫자를 비교후
        // 더 큰 수를 입력 or 더 작은수를 입력 or 정답
        do {

            System.out.print("1 ~ 100 사이의 정수 입력 >>");
            input = scanner.nextInt();
            if (answer < input) {
                System.out.println("더 작은수를 입력하세요");
            } else {
                System.out.println("더 큰수를 입력하세요");
            }
        } while (input != answer);
        System.out.println("정답입니다. 프로그램을 종료합니다");
    }
}
