package ch1;
public class VarFloatEx1 {
    public static void main(String[] args) {
        //실수향 : float,double
        //소수점 형태의 숫자를 사용하면 무조건 doublefh 인식함
        //float(4byte) = double(8byte)
        //float타입은 f,F를 붙임 
        float score1 = 90.14f;
        //douoble 타입도 d,D를 붙임
        double score2 = 98.5;
        System.out.println("score1 = "+score1);
        System.out.println("score2 = "+score2);
        System.out.printf("score2 = %f.2\n"score2);
    }
}