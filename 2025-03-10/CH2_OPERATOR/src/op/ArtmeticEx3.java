package op;

public class ArtmeticEx3 {
    public static void main(String[] args) {
        //변수 선언 - int a(10),b(4)
        byte a =10, b=4;
        
        //byte는 사칙연산시 int형로 변환되어 실행함
        //short도 int형으로 변환
    
        // +,-,*,/(몫)
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d - %d = %d\n", a, b, a-b);
        System.out.printf("%d * %d = %d\n", a, b, a*b);
        System.out.printf("%d / %d = %d\n", a, b, a/b);
        // 소수점 float,double
        // a/(flaot)b == 10/4.00000
        // a(int) / b(float) : 타입이 다른 경우 큰쪽으로 변환이 생긴다
        // int < float 
        System.out.printf("%d / %f = %f\n", a, (float)b, a/(float)b);
    }
}