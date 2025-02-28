package array;

import java.util.Arrays;
import java.util.Scanner;

// 배열 
// 같은 타입의 여러 변수를 하나의 묶음으로 다루는 개념 
// 배열의 크기는 변경 불가 

public class ArraayEx3 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 5명 학생의 수학점수를 입력받아서 평균,총합 구하기

    int[] arr = new int[5];

    System.out.print("첫번째 학생 점수 입력 >> ");
    arr[0] = sc.nextInt();

    System.out.print("두번째 학생 점수 입력 >> ");
    arr[1] = sc.nextInt();

    System.out.print("세번째 학생 점수 입력 >> ");
    arr[2] = sc.nextInt();

    System.out.print("네번째 학생 점수 입력 >> ");
    arr[3] = sc.nextInt();

    System.out.print("다섯번째 학생 점수 입력 >> ");
    arr[4] = sc.nextInt();

    // for (int i = 0; i < arr.length; i++) {
    // arr[i] = i * 10 + 10;
    // }

    System.out.println(Arrays.toString(arr));

  }
}