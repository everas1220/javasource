package oop;
//import 문

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
// Math안 요소들이 static이기 때문에
import static java.lang.Math.*;
//import 사용하지않는 패키지(자동으로 import 처리 해줌)
//java.lang.* (lang 패키지에 속한 모든 클래스)

public class ImportEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parent parent = new Parent();

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println("오늘 날짜는 : " + sdf.format(date));

        // Math : static 메서드 선언됨
        System.out.println(Math.min(15, 25));
        // System.out.println(Math.random());
        System.out.println(random());

        String str;
    }
}
