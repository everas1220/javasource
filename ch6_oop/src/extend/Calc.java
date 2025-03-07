package extend;

public class Calc {
    public static void main(String[] args) {

    }

    // loog 타입의 입력값 2개 5,3
    // 출력 : 큰숫자 => 5
    long max(long num1, long num2) {
        // 조건 ?참 :거짓;
        // if (num1 > num2) {
        // return num1;
        // }else {
        // return num2;
        // }
        return num1 > num2 ? num1 : num2;

    }

    // min
    long min(long num1, long num2) {

        // if (num1 > num2) {
        // return num2;
        // } else {
        // return num1;
        // }
        return num1 < num2 ? num1 : num2;

    }
}
