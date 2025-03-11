package op;

public class ArtmeticEx2 {
    public static void main(String[] args) {
        //변수 선언 - int a(10),b(4)
        byte a =10, b=4;
        //byte는 사칙연산시 int형로 변환되어 실행함
        //short도 int형으로 변환
        //byte c = a + b;
        //해결책 1) int c = a + b;
        //해결책 2) byte c = (byte)(a+b); 결과값이 -127~ 128사이일때만 가능      
    }
}