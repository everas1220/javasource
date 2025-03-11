package op;

import java.util.Scanner;

public class ScnnerEx1 {
    public static void main(String[] args) {
        //키보드로 입력받기 
        //System.in 키보드 입력, System.out: 화면
        Scanner scanner = new Scanner((System.in)); //키보드로 입력받는 명령어

        System.out.println("두자리 정수 입력");
        //사용자가 입력한 값을 input 변수에 담기
        //nextLine() : 무조건 문자열로 받아온다
        String input = scanner.nextLine();

        // "45"==> 45
        int num Integer.parseInt(input);
        System.out.println("입력값 : "+num);

        scanner.close();
    }
}
