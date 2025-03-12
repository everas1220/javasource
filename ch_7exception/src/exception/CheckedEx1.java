package exception;

public class CheckedEx1 {
    public static void main(String[] args) {
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            // 개발자 기준 - 예외가 어디서 발생하는가 원인 보기
            e.printStackTrace();
        }
    }
}
