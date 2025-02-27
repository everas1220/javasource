package loop;

public class ForEx1 {
    
    public static void main(String[] args){
        for (int i = 1; i < 11; i++) {
            System.out.printt(i+"     ");
        }
        System.out.println();

        // 10~1
        for (int i = 10; i > 0; i++) {
            System.out.print(i+"    ")
        }

        // 짝수만 출력 1~10
        for (int i = 1; i < 11; i++) {
            //i가 짝수이면 출력
          if (i % 2 == 0) {
            System.out.print(i+"    ")
         }
      }

      System.out.println();
      
      // i+=2
      for (int i = 1; i < 11; i++) {
            System.out.print(i + "   ");
      }
   }
}
