package poly;

public class Car3 {
    // 멤버변수 타입 : 기본,객체
    // 기본 : 정수-0, 실수-0.0,boolean-false..
    // 객체 : null

    Tire frontLeft;
    Tire frontRight;
    Tire backLeft;
    Tire backRight;

    int num;

    // 초기화1) 생성자 2) set 메서드
    // 3) 멤버변수 선언하면서 초기화하기
    public Car3(Tire frontLeft, Tire frontRight, Tire backLeft, Tire backRight) {
        this.frontLeft = frontLeft;
        this.frontRight = frontRight;
        this.backLeft = backLeft;
        this.backRight = backRight;
    }

}
