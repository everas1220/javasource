package ch1;

// byte : 8비트
//숫자 표현 : 2의 8승 =256, 음수부터 표현 256/2 +> -128 ~ 127까지 표현 가능 

public class VarByteEx1 {
    public static void main(String[] args) {
        // 변수
        // 기본타입이라고 부르는 형태가 있음 : 정수형,문자형,실수형,불린형
        // 정수형: byte(1),short(2),int(4),long(8)
        // 문자형: char(2)
        // 실수형:float(4),double(8)
        // 불린형:boolean(1)

        // 변수선언: 타입 변수명 = 값;
        // 변수명 : 단어2개가 조합이 되는 경우 뒷단어의 시작은 대문자로 한다 
        // max-speed : 데이터베이스 필드명 
        byte age = 15,maxSpeed = 100;
     //변수명 타입 = 값
        
        
        // byte max = 256;

        // System.out.println(age);
        // System.out.println(maxSpeed);

        // +: 산술연산
        // +: 연결 사이에(문자){","과 같은}
    
        System.out.println("나이 : "+age + ", 최고속도 : " + maxSpeed);
        System.out.printf(format:"나이 : 
        System.out.println(age + maxSpeed);
    }
}
