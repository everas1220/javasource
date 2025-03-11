package ch1;

// byte : 8비트
//숫자 표현 : 2의 8승 =256, 음수부터 표현 256/2 +> -128 ~ 127까지 표현 가능 

public class VarIntEx1{
    public static void main(String[] args) {
        // 변수
        // 기본타입이라고 부르는 형태가 있음 : 정수형,문자형,실수형,불린형
        // 정수형: byte(1),short(2),int(4),long(8)
        // 문자형: char(2)
        // 실수형:float(4),double(8)
        // 불린형:boolean(1)

        //상수 : 값을 한번만 지정
        //타입 상수명 =값; final int MAX_VALUE = 100;

        // 변수선언: 타입 변수명 = 값;
        // 변수명 : 단어2개가 조합이 되는 경우 뒷단어의 시작은 대문자로 한다 
        // max-speed : 데이터베이스 필드명
        // long : L,l븉인다
        long, maxSpeed = 100;
        long money = 1000000000000L;
     //변수명 타입 = 값

        
     //변수값 변경
        age = 38;
        
        // byte max = 256;

        // System.out.println(age);
        // System.out.println(maxSpeed);

        // +: 산술연산
        // +: 연결 사이에(문자){","과 같은}
        System.out.println(money);
        System.out.println("나이 : "+age + ", 최고속도 : " + maxSpeed + "max : "+max);
        System.out.println(age + maxSpeed);

        //형식화된 출력 불편함이 있음
        //%b : boolean,%d :정수,%f: 실수, %s는 문자열,%c는 문자 
        System.out.printf(나이 : "age + %d, 최고속도 : %d max :%d\n",age,maxSpeed,max);
    }
}
