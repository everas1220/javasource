package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraayEx5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // ?명 학생의 수학점수를 입력받아서 평균 총합 구하기
    int arr[]; // 배열선언

    System.out.printf("학생의 수 입력 >>");
    int num = sc.nextInt();
    // 배열 생성
    arr = new int[num];

    for (int i = 0; i < arr.length; i++) {
      System.out.printf("%d 번째 학생 점수 입력 >> ", (i + 1));
      arr[i] = sc.nextInt();
    }

    System.out.println(Arrays.toString(arr));

    // 평균, 총합
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      // sum = sum +arr[i];
      sum += arr[i];
    }

    System.out.printf("총합 : %d, 평균 : %d\n", sum, sum / arr.length);
    System.out.printf("총합 : %d, 평균 : %.2f\n", sum, (double) sum / arr.length);

  }
}