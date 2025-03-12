package api.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {

        String str = "안녕하세요";

        // 문자열 길이
        System.out.println("" + str.length());
        // (지정된 위치에 있는 문자 반환)
        System.out.println("" + str.charAt(0));
        System.out.println("" + str.charAt(4));

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        // char 배열로 변환
        // char[] chArr = new char[5];
        char[] chArr = new char[str.length()];
        // chArr[0] = str.charAt(0);
        // chArr[1] = str.charAt(1);
        // chArr[2] = str.charAt(2);
        // chArr[3] = str.charAt(3);
        // chArr[4] = str.charAt(4);
        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = str.charAt(i);
        }

        System.out.println("chArr " + Arrays.toString(chArr));

        // String => char 배열
        char[] result = str.toCharArray();

        // 존재하면 인덱스 반환
        System.out.println("주어진 문자가 문자열에 존재 여부 확인\n" + str.indexOf("안"));
        System.out.println("주어진 문자가 문자열에 존재 여부 확인\n" + str.indexOf("반"));

        System.out.println("주어진 문자가 문자열에 존재여부 확인" + str.contains("안"));

        String subject = "자바의 정석";
        // 자바 문자가 있으면 자바와 관련있는 책입니다 / 자바와 관련없는 책입니다.
        System.out.println(subject.indexOf("자바"));

        if (subject.indexOf("자바") > -1) {
            System.out.println("자바와 관련있는 책입니다");
        } else {
            System.out.println("자바와 관련없는 책입니다");
        }

        if (subject.contains("자바")) {
            System.out.println("자바와 관련있는 책입니다");
        } else {
            System.out.println("자바와 관련없는 책입니다");
        }

        // 찾기 시작하는 위치를 지정 가능함
        System.out.println("찾는 위치지정" + str.indexOf("하", 4));
        System.out.println("문자열의 오른쪽 끝부터 찾기" + str.lastIndexOf("하"));

        String str2 = "java.lang.String";
        // 위치로 받고싶으면 indexOf

        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".", 5));
        System.out.println(str2.lastIndexOf("."));

    }
}