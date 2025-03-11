package ch1;

public class VarCharEx1 {
   
   public static void main(String[] args) {   
    // 문자 : 글자한개 => 'a','미',' '
    // 문자열 : 글자한개~여러개 "미","a","abc","대한민국"," "
    char ch1 = '기';
    char ch2 = 'a';
    //ch1의 값을 unicode 변수에 대입 
    // int = char
    int unicode = ch1;
    System.out.println("ch2 = "+ch2);
    System.out.println("unicode = "+unicode);

    char ch2 ='a';
    unicode = ch2;
    System.out.println("ch2 = "+ch2);
     System.out.println("unicode = "+unicode); //97

    char ch3 = 'a';
    unicode = ch3;
    System.out.println("ch3 = "+ch3);
    System.out.printf("ch3 = %c\n",ch3);
    System.out.println("unicode = "+unicode); //65
   }

}
