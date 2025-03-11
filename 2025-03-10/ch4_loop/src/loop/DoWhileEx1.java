package loop;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // 컴퓨터가 1~100 사이의 임의의 수를 생성/ 생성된 숫자를 맞추기

        Scanner scanner = new Scanner(System.in); // new Scanner(System.in) 키보드 입력

        int answer = (int) (Math.random() * 100) + 1;
        int input = 0; // 사용자 답변 저장

        // 1~100사이의 정수를 입력받아서 컴퓨터에서 숫자를 비교후
        // 더 큰 수를 입력 or 더 작은수를 입력 or 정답
        int i = 0;
        do {
            // for, while 두 조건문의 while문이 차이는 무조건 한번은 실행한다(조건검사는 나중에)

        } while (input != answer);
    }
}
