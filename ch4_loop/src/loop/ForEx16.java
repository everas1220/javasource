package loop;

public class ForEx16 {
      public static void main(String[] args) {
            // 1~100 사이의 소수 구하기
            // 소수 : 1과 자기자신을 제외한 어떤수로도 나누어 지지않은 수
            int cnt = 0; // 나누어 떨어지는 갯수 세기
            for (int i = 2; i < 101; i++) {
                  for (int j = 1; j <= i; j++) {
                        if (i % j == 0) {
                              cnt++;
                        }
                  }

                  if (cnt == 2) {
                        System.out.printf("%d\n", i);
                  }
                  cnt = 0;
            }
      }
}