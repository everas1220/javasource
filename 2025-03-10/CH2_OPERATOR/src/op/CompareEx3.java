package op;

//문자열 : "" 사용 "a","abc"
public class CompareEx3 {
    public static void main(String[] args) {
      // 변수선언 : 기본타입(ch1-VarByteEx1 참조)
      // 문자열은 기본타입으로 선언하지 않는다. 객체타입으로 선언 
      String str1 = "abc"; 
      String str2 = "abc";
      String str3 = new String("abc");
      

      // str1(str2)을 저장하는 공간과 str3를 저장하는 공간이 다르다 
      // 같은 공간에서 저장된 문자열 비교시 == 을 사용하면 true 
      // 다른 공간에서 저장된 문자열 비교시 == 을 사용하면 주소를 비교한다


      System.out.printf("str1 == str2 = %b\n",(str1 == str2)); //true
      System.out.printf("str1 == str3 = %b\n",(str1 == str3)); //false
      // 문자열 비교 == 대신에,equals(),equalsIgnoreCase() 사용 
      // abc =/= ABC 같은걸로 하고싶으면 equalsIgnoreCase 사용 사용하지않으면 false값이 나옴
      System.out.printf("str1 equals(str3) = %b\n",(str1.equals(str3))); //true 
      System.out.printf("str1 equals(ABC) = %b\n",(str1.equals("ABC"))); //false     
      System.out.printf("str1 equalsIgnoreCase(str3) = %b\n",(str1.equalsIgnoreCase(str3))); //ture 
      System.out.printf("str1 equalsIgnoreCase(ABC) = %b\n",(str1.equalsIgnoreCase("ABC"))); //true

    }
}
