package op;

//증강연산자 :+1,-1 간단하게 처리
// ++,-- :변수 앞(전위) 변수 뒤 (후위)
//전위든 후위든 단독으로 사용되는 경우느 결과가 동일하다
// 다른수식에 포함되거나, 메서드의 매개변수에 사용되는 경우,단독으로
//사용되지않은 경우는 결과가 다르다.
public class IncDecOperEx {
    public static void main(String[] args) {
        int num = 10;

       //um = num + 1;
        ++num;
        System.out.println("num = "+num);


      //num = num -1;
        --num;
        System.out.println("num = "+num);

        int num2 =20;
        //++num2
        //① num2 +1을 먼저한 후 사용 
        //num2++
        //①num2 사용
        //①num2 +1을 함
        System.out.println("num2 ="+(++num2));



    }
}
