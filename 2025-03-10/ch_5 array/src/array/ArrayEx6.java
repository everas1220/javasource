package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
  public static void main(String[] args) {
    // char 값 5개

    // 타입 배열명 = {};
    char chArr[] = { 'a', 'b', 'c', 'd', 'e' }; // 배열 선언,생성

    // 배열 길이
    System.out.println("길이 :" + chArr.length);

    // 배열요소 확인
    System.out.println(chArr);
    System.out.println(Arrays.toString(chArr)); // [a,b,c,d,e]
    // 배열 요소 변경
    chArr[2] = 'f';
    System.out.println(Arrays.toString(chArr));

    // double 배열 선언, 생성 (5)
    double dblArr[] = { 90.5, 88.12, 78.45, 62.4, 55 };
    System.out.println(dblArr); //
    // Arrays.toString() : 배열명이 카리키는 곳의 실제 값을 출력
    System.out.println(Arrays.toString(dblArr));
  }
}