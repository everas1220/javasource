package array;

import java.util.Arrays;

// 배열 
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념 
// 배열의 크기는 변경 불가 

public class ArrayEx2 {
  public static void main(String[] args) {
    // 길이가 10인 int형 배열 생성
    int[] arr = new int[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i * 10 + 10;
    }

    // 배열요소의 값 확인
    // 1) for 문 사용 : 원하는 형태로 출력이 가능하다
    // 2) 향상된 for 문 : 1) 번과 같음
    // 3) Arrays.toString(배열명) : [배열요소 출력] => 확인용

    System.out.println(Arrays.toString(arr));

    for (int i : arr) {
      System.out.println(i + "=\t");
    }
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t");
    }

  }
}