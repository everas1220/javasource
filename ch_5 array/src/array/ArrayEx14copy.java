package array;

import java.util.Arrays;

public class ArrayEx14copy {
    public static void main(String[] args) {
        int score[][] = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 56 },
                { 20, 30, 40 },
        };

        int korTotal = 0, engtotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=======================================");

        for (int i = 0; i < score.length; i++) {
            System.out.printf("%3d", i + 1);

            int sum = 0; // 개인별 총점
            float avg = 0.0f; // 개인별 평균

            korTotal += score[i][0];
            engtotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score.length; j++) {

                // 개인별 평균 계산 후 출력
                avg = sum / (float) score[i].length;
                System.out.printf("%5 %5.1f\n", sum, avg);
            }

            System.out.println("======================================");
            System.out.printf("총점 : %3d %3d %3d\n", korTotal, engtotal, mathTotal);

        }
    }
}