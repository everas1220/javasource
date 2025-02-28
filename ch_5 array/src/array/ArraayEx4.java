package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraayEx4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

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