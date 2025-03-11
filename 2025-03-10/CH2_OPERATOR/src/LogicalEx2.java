import java.util.Scanner;

public class LogicalEx2 {

    //논리 연산자: 비교 연산자 여러개 연결 => true, false
    // x가 4보다 작거나 10보다 크다 
    // &&(and),||(or),!(not)
    // &&(and) : true && true ==> true (둘다 true 여야 true)
    // ||(or) : true || false ==> true(둘중 하나만 ture 라면 결과값은 true)
    // !(not) : !(true) ==> false, !(false) ==> true 

    public static void main(String[] args) {
        //사용자로부터 문자를 입력받은휴 그 문자가
        // 숫자인지 문자인지 판별하는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 하나 입력하세요");
        
        String input = scanner.nextLine();
        
        // "abc" => "abc".charAt(0) : a,"abc".charAt(1) : b
        // charAt(index) : 문자열을 문자로 분해해서 돌려받을수있다
        // index는 0번부터 시작 
        char ch = input.charAt(0);

        
            //아래 괄호안에 들어간게 true값이면 그아래있는 문자열을 실행
        if ('0' <= ch && ch <= '9') {
            System.out.println("입력하신 문자는 숫자 입니다");
        }

        if (('a' <= ch && ch <='z') ||('A'<= ch && ch <='Z')){
            System.out.println("입력하신 문자는 영문자 입니다");
        }

        scanner.close();

    }
}
