package op;
//비교연산자
//대소비고 : <,>,<=,>=
//등가비교 : ==(equal), !=(not equal)

// \t(tab)
// %b(boolean 값 출력)
// 두변수의 타입이 다른경우 타입을 맞춘 후비교
public class CompareEx1 {
    public static void main(String[] args) {
       System.out.printf("10 == 10.0f \t %b\n",( 10==10.0f));
       System.out.printf("0 == 0 \t %b\n",('0' == 0)); //48 == 0
       System.out.printf("A == 65 \t %b\n",('A' == 65));
       System.out.printf("'A' > 'B' \t %b\n",( 'A' > 'B'));
       System.out.printf("'A+1 != 'B' \t %b\n",('A'+1 != 'b'));
    }
}
