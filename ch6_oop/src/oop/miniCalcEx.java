package oop;

public class miniCalcEx {
    public static void main(String[] args) {
        // print() 메서드 호출
        // 클래스 메서드(or 변수)이기에 객체 생성없이 클래스 이름으로 호출 가능
        MiniCalc.print();
        System.out.println(MiniCalc.k);

        // execute() 호출
        MiniCalc calc = new MiniCalc();
        calc.execute();
        calc.a = 7;
    }
}
